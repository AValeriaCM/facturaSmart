package com.smart.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class DetalleDto  implements Serializable{
	
	/**
	 * Inicializacion de campos
	 */
	
	private static final long serialVersionUID = 1L;
	
	private Integer num_detalle;
	private Integer id_factura;
	private Integer id_producto;
	
	@NotNull(message = "Cantidad es campo obligatorio")
	private Integer cantidad;
	
	@NotNull(message = "Cantidad es campo obligatorio")
	private Integer precio;
	
	/**
	 * Constructor
	 * @param num_detalle
	 * @param id_factura
	 * @param id_producto
	 * @param cantidad
	 * @param precio
	 */

	public DetalleDto(Integer num_detalle, Integer id_factura, Integer id_producto,
			@NotNull(message = "Cantidad es campo obligatorio") Integer cantidad,
			@NotNull(message = "Cantidad es campo obligatorio") Integer precio) {
		super();
		this.num_detalle = num_detalle;
		this.id_factura = id_factura;
		this.id_producto = id_producto;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getNum_detalle() {
		return num_detalle;
	}
	/**
	 * 
	 * @param num_detalle
	 */
	public void setNum_detalle(Integer num_detalle) {
		this.num_detalle = num_detalle;
	}
	/**
	 * 
	 * @return
	 */
	public Integer getId_factura() {
		return id_factura;
	}
	/**
	 * 
	 * @param id_factura
	 */
	public void setId_factura(Integer id_factura) {
		this.id_factura = id_factura;
	}
	/**
	 * 
	 * @return
	 */
	public Integer getId_producto() {
		return id_producto;
	}
	/**
	 * 
	 * @param id_producto
	 */
	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}
	/**
	 * 
	 * @return
	 */
	public Integer getCantidad() {
		return cantidad;
	}
	/**
	 * 
	 * @param cantidad
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * 
	 * @return
	 */
	public Integer getPrecio() {
		return precio;
	}
	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	
	
}
