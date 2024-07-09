package com.springboot_api.app.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tipoproducto")
public class TipoProducto implements Serializable{

	private static final long serialVersionUID = 5505413102684540675L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdTipoProducto;
	
	@Column(length=20)
	private String Codigo;
	
	private String Descripcion;

	public Long getIdTipoProducto() {
		return IdTipoProducto;
	}

	public void setIdTipoProducto(Long idTipoProducto) {
		IdTipoProducto = idTipoProducto;
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
