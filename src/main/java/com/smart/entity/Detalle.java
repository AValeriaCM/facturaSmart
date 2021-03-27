package com.smart.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "detalle")
@IdClass(DetallePK.class)
public class Detalle implements Serializable {

	/**
	 * Inicializacion de campos
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer num_detalle;
	
	@Id
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Factura factura;
	
	@ManyToOne
	@JoinColumn(name = "id_producto", foreignKey = @ForeignKey(name = "FK_producto"))
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Producto producto;

	@NotNull(message = "Cantidad es requerido")
	@Column(name = "cantidad", nullable = false)
	private Integer cantidad;

	@NotNull(message = "Precio es requerido")
	@Column(name = "precio", nullable = false, length = 45)
	private Integer precio;
	
	@OneToMany(mappedBy = "detalle", orphanRemoval=true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Producto> listaProductos;


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

	/**
	 * 
	 * @return
	 */
	public Factura getFactura() {
		return factura;
	}

	/**
	 * 
	 * @param factura
	 */
	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Integer getNum_detalle() {
		return num_detalle;
	}

	public void setNum_detalle(Integer num_detalle) {
		this.num_detalle = num_detalle;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	@JsonIgnore()
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	
	
}
