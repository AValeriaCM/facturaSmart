package com.smart.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ClienteDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id_cliente;
	
	@NotNull(message = "Nombre es campo obligatorio")
	@Size(min = 2,  max = 25, message = "Nombre entre 2 y 25 carácteres")
	private String nombre;

	@NotNull(message = "Apellido es campo obligatorio")
	@Size(min = 2,  max = 25, message = "Nombre entre 2 y 25 carácteres")
	private String apellido;
	
	@NotNull(message = "Direccion es campo obligatorio")
	@Size(min = 2,  max = 25, message = "Nombre entre 2 y 25 carácteres")
	private String direccion;
	
	@NotNull(message = "Fecha es campo obligatorio")
	@Size(min = 2,  max = 25, message = "Nombre entre 2 y 25 carácteres")
	private LocalDate fecha_nacimiento;
	
	@NotNull(message = "Telefono es campo obligatorio")
	@Size(min = 2,  max = 25, message = "Nombre entre 2 y 25 carácteres")
	private Integer telefono;
	
	@NotNull(message = "Nombre es campo obligatorio")
	@Size(min = 2,  max = 25, message = "Nombre entre 2 y 25 carácteres")
	private Email email;
	
	/*
	 * Constructor de la clase
	 */
	public ClienteDto(Integer id_cliente,
			@NotNull(message = "Nombre es campo obligatorio") @Size(min = 2, max = 25, message = "Nombre entre 2 y 25 carácteres") String nombre,
			@NotNull(message = "Apellido es campo obligatorio") @Size(min = 2, max = 25, message = "Nombre entre 2 y 25 carácteres") String apellido,
			@NotNull(message = "Direccion es campo obligatorio") @Size(min = 2, max = 25, message = "Nombre entre 2 y 25 carácteres") String direccion,
			@NotNull(message = "Fecha es campo obligatorio") @Size(min = 2, max = 25, message = "Nombre entre 2 y 25 carácteres") LocalDate fecha_nacimiento,
			@NotNull(message = "Telefono es campo obligatorio") @Size(min = 2, max = 25, message = "Nombre entre 2 y 25 carácteres") Integer telefono,
			@NotNull(message = "Nombre es campo obligatorio") @Size(min = 2, max = 25, message = "Nombre entre 2 y 25 carácteres") Email email) {
		super();
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.fecha_nacimiento = fecha_nacimiento;
		this.telefono = telefono;
		this.email = email;
	}


	/*
	 * Getters y setters de los campos del Dto cliente
	 */
	public Integer getId_cliente() {
		return id_cliente;
	}

	
	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}


	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}


	public Integer getTelefono() {
		return telefono;
	}


	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}


	public Email getEmail() {
		return email;
	}


	public void setEmail(Email email) {
		this.email = email;
	}

	
	
	
	
}
