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
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table
public class Cliente {

	/**
	 * Inicializacion de campos
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id_cliente;

	@NotNull(message = "El nombre es requerido")
	@Column(name = "nombre", nullable = false, length = 45)
	private String nombre;

	@NotNull(message = "El apellido es requerido")
	@Column(name = "apellido", nullable = false, length = 45)
	private String apellido;

	@NotNull(message = "El campo direccion es requerido")
	@Column(name = "direccion", nullable = false)
	private String direccion;

	@Pattern(regexp = "[0-9]+", message = "El telefono solo puede tener números")
	@Column(name = "telefono", nullable = false)
	private String telefono;

	@NotNull(message = "El campo email es requerido")
	@Email(message = "el email debe ser valido")
	@Column(name = "email", nullable = false)
	private String email;

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

}
