package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springboot_api.app.entity.Detalle;

public interface DetalleService {
	
	public Iterable<Detalle> findAll();
	
	public Page<Detalle> findAll(Pageable pageable);
	
	public Optional<Detalle> findById(Long id);
	
	public Detalle save(Detalle detalle);
	
	public void deleteById(Long id);

}