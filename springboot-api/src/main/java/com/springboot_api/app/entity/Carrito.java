package com.springboot_api.app.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="carrito")
public class Carrito implements Serializable {
	
	private static final long serialVersionUID = 5505413102684540675L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdCarrito;
	
	@Column(length=100)
	private String Email;
	private Long IdTipoEntrega;
	public Long getIdCarrito() {
		return IdCarrito;
	}
	public void setIdCarrito(Long idCarrito) {
		IdCarrito = idCarrito;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Long getIdTipoEntrega() {
		return IdTipoEntrega;
	}
	public void setIdTipoEntrega(Long idTipoEntrega) {
		IdTipoEntrega = idTipoEntrega;
	}

}
