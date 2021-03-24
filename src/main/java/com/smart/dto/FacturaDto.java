package com.smart.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class FacturaDto implements Serializable{
	
	/**
	 * Inicializacion de campos
	 */
	
	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "Numero de Factura es campo obligatorio")
	@Size(min = 2,  max = 25, message = "Nombre entre 2 y 25 carácteres")
	private Integer num_factura;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente", foreignKey = @ForeignKey(name = "FK_cliente"))
	private Integer id_cliente;
	
	
	@DateTimeFormat(pattern = "dd/MM/yyyy", iso = ISO.DATE)
	@Column(name = "fecha")
	private LocalDateTime fecha;
	
	/**
	 * Constructor
	 * @param num_factura
	 * @param id_cliente
	 * @param fecha
	 */
	public FacturaDto(Integer num_factura, Integer id_cliente, LocalDateTime fecha) {
		super();
		this.num_factura = num_factura;
		this.id_cliente = id_cliente;
		this.fecha = fecha;
	}

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
	public Integer getId_cliente() {
		return id_cliente;
	}
	/**
	 * 
	 * @param id_cliente
	 */
	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}
	/**
	 * 
	 * @return
	 */
	public LocalDateTime getFecha() {
		return fecha;
	}
	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	

}
