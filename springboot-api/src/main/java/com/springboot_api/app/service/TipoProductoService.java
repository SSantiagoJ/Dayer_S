package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springboot_api.app.entity.TipoProducto;

public interface TipoProductoService {
	
	public Iterable<TipoProducto> findAll();
	
	public Page<TipoProducto> findAll(Pageable pageable);
	
	public Optional<TipoProducto> findById(Long id);
	
	public TipoProducto save(TipoProducto tipoproducto);
	
	public void deleteById(Long id);

}