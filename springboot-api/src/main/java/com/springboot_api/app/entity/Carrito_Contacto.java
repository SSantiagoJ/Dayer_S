package com.springboot_api.app.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="carrito_contacto")
public class Carrito_Contacto implements Serializable{
	
	private static final long serialVersionUID = 5505413102684540675L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdCarritoContacto;
	
	private Long IdCarrito;
	
	public Long getIdCarritoContacto() {
		return IdCarritoContacto;
	}
	public void setIdCarritoContacto(Long idCarritoContacto) {
		IdCarritoContacto = idCarritoContacto;
	}
	public Long getIdCarrito() {
		return IdCarrito;
	}
	public void setIdCarrito(Long idCarrito) {
		IdCarrito = idCarrito;
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
	public String getEmpresa() {
		return Empresa;
	}
	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getNroDocumento() {
		return NroDocumento;
	}
	public void setNroDocumento(String nroDocumento) {
		NroDocumento = nroDocumento;
	}
	public String getInformacionAdicional() {
		return InformacionAdicional;
	}
	public void setInformacionAdicional(String informacionAdicional) {
		InformacionAdicional = informacionAdicional;
	}
	@Column(length=50)
	private String Nombres;
	private String Apellidos;
	private String Empresa;
	private String Direccion;
	private String Ciudad;
	private String Pais;
	private String Telefono;
	private String NroDocumento;
	private String InformacionAdicional;
}
