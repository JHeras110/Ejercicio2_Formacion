package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Formacion;
import com.example.services.FormacionService;

/**
 * Controlador que recoge las diferentes url que puede meter el usuario con los posibles parametros
 * @param Formacion
 * y ejecuta la accion correspondiente.
 */
@RestController
public class FormacionController {

    @Autowired
	FormacionService service;

	@GetMapping(value = "formaciones")
	public List<Formacion> getformacionPorPrecio(){
		return service.getFormaciones();
	}

	@PostMapping(value = "formacion")
	public List<Formacion> postFormacion( @RequestBody Formacion formacion){                   
		return service.postFormacion(formacion);
	}
}
