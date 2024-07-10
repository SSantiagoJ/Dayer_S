package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot_api.app.entity.TipoProducto;
import com.springboot_api.app.repository.TipoProductoRepository;

@Service
public class TipoProductoServiceImpl implements TipoProductoService{

	@Autowired
	private TipoProductoRepository tipoProductoRepository;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<TipoProducto> findAll() {
		return tipoProductoRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<TipoProducto> findAll(Pageable pageable) {
		return tipoProductoRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<TipoProducto> findById(Long id) {
		return tipoProductoRepository.findById(id);
	}

	@Override
	@Transactional
	public TipoProducto save(TipoProducto tipoproducto) {
		return tipoProductoRepository.save(tipoproducto);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		tipoProductoRepository.deleteById(id);
	}

}
