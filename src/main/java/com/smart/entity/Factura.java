package com.smart.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table
public class Factura {

	/**
	 * Inicializacion de campos
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer num_factura;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente", foreignKey = @ForeignKey(name = "FK_cliente"))
	private Cliente cliente;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy", iso = ISO.DATE)
	@Column(name = "fecha")
	private LocalDate fecha;

	/**
	 * 
	 * @return
	 */
	public Integer getNum_factura() {
		return num_factura;
	}
	/**
	 * 
	 * @param num_factura
	 */
	public void setNum_factura(Integer num_factura) {
		this.num_factura = num_factura;
	}
	/**
	 * 
	 * @return
	 */
	@JsonIgnore
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * 
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * 
	 * @return
	 */
	public LocalDate getFecha() {
		return fecha;
	}
	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
}
