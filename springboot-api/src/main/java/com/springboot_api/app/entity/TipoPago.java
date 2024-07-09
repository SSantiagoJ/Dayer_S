package com.springboot_api.app.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tipopago")
public class TipoPago implements Serializable{
	private static final long serialVersionUID = 5505413102684540675L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdTipoPago;
	private String Codigo;
	private String Descripcion;
	public Long getIdTipoPago() {
		return IdTipoPago;
	}
	public void setIdTipoPago(Long idTipoPago) {
		IdTipoPago = idTipoPago;
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
