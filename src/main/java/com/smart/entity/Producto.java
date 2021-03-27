package com.smart.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "producto")
public class Producto implements Serializable {

	/**
	 * Inicializacion de campos
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_producto;

	@NotNull(message = "El nombre es requerido")
	@Column(name = "nombre", nullable = false, length = 45)
	private String nombre;

	@NotNull(message = "Precio es requerido")
	@Column(name = "precio", nullable = false, length = 45)
	private Integer precio;

	@NotNull(message = "Stock es requerido")
	@Column(name = "stock", nullable = false, length = 45)
	private Integer stock;
	
	@OneToMany(mappedBy = "producto", orphanRemoval=true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Detalle> listaDetalles;

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

	public List<Detalle> getListaDetalles() {
		return listaDetalles;
	}

	public void setListaDetalles(List<Detalle> listaDetalles) {
		this.listaDetalles = listaDetalles;
	}
	
	
	

}
