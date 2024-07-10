package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springboot_api.app.entity.Carrito_Detalle;

public interface Carrito_DetalleService {
	
	public Iterable<Carrito_Detalle> findAll();
	
	public Page<Carrito_Detalle> findAll(Pageable pageable);
	
	public Optional<Carrito_Detalle> findById(Long id);
	
	public Carrito_Detalle save(Carrito_Detalle carrito_detalle);
	
	public void deleteById(Long id);

}