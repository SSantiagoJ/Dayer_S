package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springboot_api.app.entity.PedidoVenta;

public interface PedidoVentaService {
	
	public Iterable<PedidoVenta> findAll();
	
	public Page<PedidoVenta> findAll(Pageable pageable);
	
	public Optional<PedidoVenta> findById(Long id);
	
	public PedidoVenta save(PedidoVenta pedidoventa);
	
	public void deleteById(Long id);

}