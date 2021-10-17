package com.securex.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.securex.model.Persona;

public interface IPersonaService extends ICRUD<Persona, Integer>{

	Page<Persona> listarPageable(Pageable pageable);
}
