package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springboot_api.app.entity.Carrito;

public interface CarritoService {
	
	public Iterable<Carrito> findAll();
	
	public Page<Carrito> findAll(Pageable pageable);
	
	public Optional<Carrito> findById(Long id);
	
	public Carrito save(Carrito carrito);
	
	public void deleteById(Long id);

}