package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot_api.app.entity.TipoPago;
import com.springboot_api.app.repository.TipoPagoRepository;

@Service
public class TipoPagoServiceImpl implements TipoPagoService{

	@Autowired
	private TipoPagoRepository tipoPagoRepository;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<TipoPago> findAll() {
		return tipoPagoRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<TipoPago> findAll(Pageable pageable) {
		return tipoPagoRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<TipoPago> findById(Long id) {
		return tipoPagoRepository.findById(id);
	}

	@Override
	@Transactional
	public TipoPago save(TipoPago tipopago) {
		return tipoPagoRepository.save(tipopago);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		tipoPagoRepository.deleteById(id);
	}

}
