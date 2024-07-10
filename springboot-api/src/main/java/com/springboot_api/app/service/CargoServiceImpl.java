package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot_api.app.entity.Cargo;
import com.springboot_api.app.repository.CargoRepository;

@Service
public class CargoServiceImpl implements CargoService{

	@Autowired
	private CargoRepository cargoRepository;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Cargo> findAll() {
		return cargoRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Cargo> findAll(Pageable pageable) {
		return cargoRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Cargo> findById(Long id) {
		return cargoRepository.findById(id);
	}

	@Override
	@Transactional
	public Cargo save(Cargo cargo) {
		return cargoRepository.save(cargo);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		cargoRepository.deleteById(id);
	}

}
