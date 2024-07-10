package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springboot_api.app.entity.Opcion;

public interface OpcionService {
	
	public Iterable<Opcion> findAll();
	
	public Page<Opcion> findAll(Pageable pageable);
	
	public Optional<Opcion> findById(Long id);
	
	public Opcion save(Opcion opcion);
	
	public void deleteById(Long id);

}