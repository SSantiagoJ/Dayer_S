package com.springboot_api.app.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 5505413102684540675L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdUsuario;
	
	private Long IdCargo ;
	
	private String Usuario;
	
	@Column(length=50)
	private String Nombres;
	
	@Column(length=80)
	private String Apellidos;
	
	private String Email;
	
	private String Contraseña;
	
	private Long Activo;

	public Long getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		IdUsuario = idUsuario;
	}

	public Long getIdCargo() {
		return IdCargo;
	}

	public void setIdCargo(Long idCargo) {
		IdCargo = idCargo;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public Long getActivo() {
		return Activo;
	}

	public void setActivo(Long activo) {
		Activo = activo;
	}	
	
}
