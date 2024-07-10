package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot_api.app.entity.Detalle;
import com.springboot_api.app.repository.DetalleRepository;

@Service
public class DetalleServiceImpl implements DetalleService{

	@Autowired
	private DetalleRepository detalleRepository;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Detalle> findAll() {
		return detalleRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Detalle> findAll(Pageable pageable) {
		return detalleRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Detalle> findById(Long id) {
		return detalleRepository.findById(id);
	}

	@Override
	@Transactional
	public Detalle save(Detalle detalle) {
		return detalleRepository.save(detalle);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		detalleRepository.deleteById(id);
	}
	

}
