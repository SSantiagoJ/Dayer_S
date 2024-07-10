package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springboot_api.app.entity.UsuarioOpcion;

public interface UsuarioOpcionService {
	
	public Iterable<UsuarioOpcion> findAll();
	
	public Page<UsuarioOpcion> findAll(Pageable pageable);
	
	public Optional<UsuarioOpcion> findById(Long id);
	
	public UsuarioOpcion save(UsuarioOpcion usuarioopcion);
	
	public void deleteById(Long id);

}