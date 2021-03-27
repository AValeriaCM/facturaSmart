package com.smart.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Embeddable
public class DetallePK implements Serializable{


	@ManyToOne
	@JoinColumn(name = "id_factura", nullable = false)
	private Factura factura;

	
}
