package com.example.services;

import java.util.List;

import com.example.model.Formacion;

/**
 * Hace de intermediario entre el Controller y el Servicio al que le exige los metodos que necesitas tener
 */
public interface FormacionService {
    List<Formacion> getFormaciones();
    List<Formacion> postFormacion(Formacion formacion);
}
