package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springboot_api.app.entity.Carrito_Contacto;

public interface Carrito_ContactoService {
	
	public Iterable<Carrito_Contacto> findAll();
	
	public Page<Carrito_Contacto> findAll(Pageable pageable);
	
	public Optional<Carrito_Contacto> findById(Long id);
	
	public Carrito_Contacto save(Carrito_Contacto carrito_contacto);
	
	public void deleteById(Long id);

}