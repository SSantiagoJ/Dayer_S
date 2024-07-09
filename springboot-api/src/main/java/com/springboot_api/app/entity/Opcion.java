package com.springboot_api.app.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="opcion")
public class Opcion implements Serializable{
	private static final long serialVersionUID = 5505413102684540675L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdOpcion;
	private String Codigo;
	private String Descripcion;
	public Long getIdOpcion() {
		return IdOpcion;
	}
	public void setIdOpcion(Long idOpcion) {
		IdOpcion = idOpcion;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	

}
