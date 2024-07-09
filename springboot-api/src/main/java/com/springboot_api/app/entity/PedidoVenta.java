package com.springboot_api.app.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pedidoventa")
public class PedidoVenta implements Serializable{
	private static final long serialVersionUID = 5505413102684540675L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdPedidoVenta;
	
	private Long IdCliente;
	private Long IdTipoPago;
	private Long IdTipoComprobante;
	private String NroDocumento;
	private String Fecha;
	private Double Subtotal;
	private Double GastoEnvio;
	private Double Impuesto;
	private Double descuento;
	private Double MontoTotal;
	public Long getIdPedidoVenta() {
		return IdPedidoVenta;
	}
	public void setIdPedidoVenta(Long idPedidoVenta) {
		IdPedidoVenta = idPedidoVenta;
	}
	public Long getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(Long idCliente) {
		IdCliente = idCliente;
	}
	public Long getIdTipoPago() {
		return IdTipoPago;
	}
	public void setIdTipoPago(Long idTipoPago) {
		IdTipoPago = idTipoPago;
	}
	public Long getIdTipoComprobante() {
		return IdTipoComprobante;
	}
	public void setIdTipoComprobante(Long idTipoComprobante) {
		IdTipoComprobante = idTipoComprobante;
	}
	public String getNroDocumento() {
		return NroDocumento;
	}
	public void setNroDocumento(String nroDocumento) {
		NroDocumento = nroDocumento;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public Double getSubtotal() {
		return Subtotal;
	}
	public void setSubtotal(Double subtotal) {
		Subtotal = subtotal;
	}
	public Double getGastoEnvio() {
		return GastoEnvio;
	}
	public void setGastoEnvio(Double gastoEnvio) {
		GastoEnvio = gastoEnvio;
	}
	public Double getImpuesto() {
		return Impuesto;
	}
	public void setImpuesto(Double impuesto) {
		Impuesto = impuesto;
	}
	public Double getDescuento() {
		return descuento;
	}
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	public Double getMontoTotal() {
		return MontoTotal;
	}
	public void setMontoTotal(Double montoTotal) {
		MontoTotal = montoTotal;
	}
	
}
