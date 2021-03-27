package com.smart.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{

	/**
	 * Inicializacion de campos
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cliente;

	@NotNull(message = "El nombre es requerido")
	@Column(name = "nombre", nullable = false, length = 45)
	private String nombre;

	@NotNull(message = "El campo apellido es requerido")
	@Column(name = "apellido", nullable = false, length = 45)
	private String apellido;

	@NotNull(message = "El campo direccion es requerido")
	@Column(name = "direccion", nullable = false)
	private String direccion;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy", iso = ISO.DATE)
	@Column(name = "fecha_nacimiento")
	private String fecha_nacimiento;

	@Pattern(regexp = "[0-9]+", message = "El telefono solo puede tener números")
	@Column(name = "telefono", nullable = false)
	private String telefono;

	@NotNull(message = "El campo email es requerido")
	@Email(message = "el email debe ser valido")
	@Column(name = "email", nullable = false)
	private String email;
	
	@OneToMany(mappedBy = "cliente", orphanRemoval=true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Factura> listaFacturas;

	/**
	 * Getters y setters de los campos
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
	public String getApellido() {
		return apellido;
	}

	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * 
	 * @return
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * 
	 * @return
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * 
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 
	 * @return
	 */
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	/**
	 * 
	 * @param fecha_nacimiento
	 */
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	/**
	 * 
	 * @return
	 */
	public List<Factura> getListaFacturas() {
		return listaFacturas;
	}
	/**
	 * 
	 * @param listaFacturas
	 */
	public void setListaFacturas(List<Factura> listaFacturas) {
		this.listaFacturas = listaFacturas;
	}
	
	

}
