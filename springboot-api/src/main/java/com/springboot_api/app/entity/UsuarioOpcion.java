package com.springboot_api.app.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarioopcion")
public class UsuarioOpcion implements Serializable{
	private static final long serialVersionUID = 5505413102684540675L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdUsuarioOpcion;
	private Long IdUsuario;
	private Long IdOpcion;
	public Long getIdUsuarioOpcion() {
		return IdUsuarioOpcion;
	}
	public void setIdUsuarioOpcion(Long idUsuarioOpcion) {
		IdUsuarioOpcion = idUsuarioOpcion;
	}
	public Long getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		IdUsuario = idUsuario;
	}
	public Long getIdOpcion() {
		return IdOpcion;
	}
	public void setIdOpcion(Long idOpcion) {
		IdOpcion = idOpcion;
	}
	
}
