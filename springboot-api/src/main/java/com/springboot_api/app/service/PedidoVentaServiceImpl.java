package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot_api.app.entity.PedidoVenta;
import com.springboot_api.app.repository.PedidoVentaRepository;

@Service
public class PedidoVentaServiceImpl implements PedidoVentaService{

	@Autowired
	private PedidoVentaRepository pedidoVentaRepository;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<PedidoVenta> findAll() {
		return pedidoVentaRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<PedidoVenta> findAll(Pageable pageable) {
		return pedidoVentaRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<PedidoVenta> findById(Long id) {
		return pedidoVentaRepository.findById(id);
	}

	@Override
	@Transactional
	public PedidoVenta save(PedidoVenta pedidoventa) {		
		return pedidoVentaRepository.save(pedidoventa);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		pedidoVentaRepository.deleteById(id);
	}

}
