package com.example.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dto.CursoDTO;
import com.example.model.Formacion;

/**
 * Servicio que se encarga de conectar con las url y devolverle la informacion que pide al controlador
 */
@Service
public class FormacionServiceImpl implements FormacionService{
    @Autowired
    RestTemplate template;

    private String url = "http://localhost:8880/";

    /**
     * Metodo en el que recopilo de la bbdd todos los objetos en formato CursosDTO y los convierno en Formaciones para
     * despues mostrarlo por pantalla
     */
    @Override
    public List<Formacion> getFormaciones() {
        List<CursoDTO> formacionesDTS = Arrays.asList(template.getForObject(url+"cursos", CursoDTO[].class));        
        List<Formacion> formaciones = new ArrayList<>();
        for (CursoDTO formacionDTO : formacionesDTS) {
            Formacion formacion = new Formacion();
            formacion.setNombre(formacionDTO.getNombre());
            formacion.setPrecio(formacionDTO.getPrecio());
            if(formacionDTO.getDuracion()>=50){
                formacion.setAsignaturas(10);
            }else{
                formacion.setAsignaturas(5);
            }
            formaciones.add(formacion);
        }
        return formaciones;
    }


    /**
     * Metodo en el que le paso un objeto de Formacion desde le Body y creo un CursoDTO para moverlo a la bbdd
     */
    @Override
    public List<Formacion> postFormacion(Formacion formacion) {
        CursoDTO curso = new CursoDTO();
        curso.setNombre(formacion.getNombre());
        curso.setPrecio(formacion.getPrecio());
        curso.setDuracion(formacion.getAsignaturas()*10);
        template.postForLocation(url+"curso", curso);
        return getFormaciones();
    }

    

}
