package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springboot_api.app.entity.Carrito_Direccion;

public interface Carrito_DireccionService {
	
	public Iterable<Carrito_Direccion> findAll();
	
	public Page<Carrito_Direccion> findAll(Pageable pageable);
	
	public Optional<Carrito_Direccion> findById(Long id);
	
	public Carrito_Direccion save(Carrito_Direccion carrito_direccion);
	
	public void deleteById(Long id);

}