package com.smart.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.entity.Detalle;
import com.smart.entity.Factura;
import com.smart.service.IDetalleService;

import io.swagger.annotations.Api;

@Validated
@RestController
@RequestMapping("/detalles")
public class DetalleController {
	
	@Autowired
	private IDetalleService detalleService;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Detalle>> listarDetalles(){
		List<Detalle> listaFacturas = detalleService.listar();
		return new ResponseEntity<List<Detalle>>(listaFacturas, HttpStatus.OK);
	}
	
	@GetMapping("/listar/{id}")
	public ResponseEntity<Detalle> listarPorId(@PathVariable Integer id) {
		Detalle detalle = detalleService.listarId(id);
		return new ResponseEntity<Detalle>(detalle, HttpStatus.OK);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Detalle> guardarProducto(@Valid @RequestBody Detalle obj){
		Detalle detalle = detalleService.guardar(obj);
		return new ResponseEntity<Detalle>(detalle, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Object> borrarProducto(@PathVariable Integer id){
		detalleService.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("/editar")
	public ResponseEntity<Detalle> editarFactura(@RequestBody Detalle obj) {
		Detalle detalle = detalleService.editarDetalle(obj);
		return new ResponseEntity<Detalle>(detalle, HttpStatus.OK);
	}

}
