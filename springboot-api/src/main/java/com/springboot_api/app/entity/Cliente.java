package com.springboot_api.app.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 5505413102684540675L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdCliente;
	private String Codigo;
	
	@Column(length=100)
	private String Nombres;
	private String NroDocumento;
	private String Email;
	private String Telefono;
	private String Direccion;
	public Long getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(Long idCliente) {
		IdCliente = idCliente;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getNroDocumento() {
		return NroDocumento;
	}
	public void setNroDocumento(String nroDocumento) {
		NroDocumento = nroDocumento;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
}
