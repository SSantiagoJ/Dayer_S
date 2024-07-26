package com.springboot_api.app.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_api.app.entity.Cargo;
import com.springboot_api.app.service.CargoService;

@RestController
@RequestMapping("/api/cargo")
public class CargoController {

	private CargoService cargoService;
	
	@PostMapping
	public ResponseEntity<?> create (@RequestBody Cargo cargo){
		return ResponseEntity.status(HttpStatus.CREATED).body(cargoService.save(cargo));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value="id") Long idCargo){
		Optional<Cargo> oCargo= cargoService.findById(idCargo);
		
		if(!oCargo.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(oCargo);
	}
	
}
