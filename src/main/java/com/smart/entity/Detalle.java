package com.smart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Detalle {

	/**
	 * Inicializacion de campos
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer num_detalle;

	@ManyToOne
	@JoinColumn(name = "id_factura")
	private Integer id_factura;

	@ManyToOne
	@JoinColumn(name = "id_producto", foreignKey = @ForeignKey(name = "FK_producto"))
	private Producto producto;

	@NotNull(message = "Cantidad es requerido")
	@Column(name = "cantidad", nullable = false)
	private Integer cantidad;

	@NotNull(message = "Precio es requerido")
	@Column(name = "precio", nullable = false, length = 45)
	private Integer precio;

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
	public Producto getProducto() {
		return producto;
	}

	/**
	 * 
	 * @param producto
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
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
