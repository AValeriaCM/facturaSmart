package com.smart.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProductoDto implements Serializable{
	
	/**
	 * Inicializacion de campos
	 */

	private static final long serialVersionUID = 1L;
	
	private Integer id_producto;
	
	@NotNull(message = "Nombre es campo obligatorio")
	@Size(min = 2,  max = 25, message = "Nombre entre 2 y 25 carácteres")
	private String nombre;
	
	@NotNull(message = "Precio es campo obligatorio")
	@Size(min = 2,  max = 25, message = "Precio entre 2 y 25 carácteres")
	private Integer precio;
	
	@NotNull(message = "Stock es campo obligatorio")
	@Size(min = 2,  max = 25, message = "Stock entre 2 y 25 carácteres")
	private Integer stock;

	/**
	 * Constructor
	 * @param id_producto
	 * @param nombre
	 * @param precio
	 * @param stock
	 */
	
	public ProductoDto(Integer id_producto,
			@NotNull(message = "Nombre es campo obligatorio") @Size(min = 2, max = 25, message = "Nombre entre 2 y 25 carácteres") String nombre,
			@NotNull(message = "Precio es campo obligatorio") @Size(min = 2, max = 25, message = "Nombre entre 2 y 25 carácteres") Integer precio,
			@NotNull(message = "Stock es campo obligatorio") @Size(min = 2, max = 25, message = "Nombre entre 2 y 25 carácteres") Integer stock) {
		super();
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
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
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	/**
	 * 
	 * @return
	 */
	public Integer getStock() {
		return stock;
	}
	/**
	 * 
	 * @param stock
	 */
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	
	
}
