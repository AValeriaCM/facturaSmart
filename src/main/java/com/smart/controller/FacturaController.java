package com.smart.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smart.entity.Factura;
import com.smart.entity.Producto;
import com.smart.service.IFacturaService;

@Validated
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/facturas")
public class FacturaController {

	@Autowired
	private IFacturaService facturasService;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Factura>> listarFacturas(){
		List<Factura> listaFacturas = facturasService.listar();
		return new ResponseEntity<List<Factura>>(listaFacturas, HttpStatus.OK);
	}
	
	@GetMapping("/listar/{id}")
	public ResponseEntity<Factura> listarPorId(@PathVariable Integer id) {
		Factura factura = facturasService.listarId(id);
		return new ResponseEntity<Factura>(factura, HttpStatus.OK);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Factura> guardarProducto(@Valid @RequestBody Factura obj){
		Factura factura = facturasService.guardar(obj);
		return new ResponseEntity<Factura>(factura, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Object> borrarProducto(@PathVariable Integer id){
		facturasService.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("/editar")
	public ResponseEntity<Factura> editarFactura(@RequestBody Factura obj) {
		Factura factura = facturasService.editarFactura(obj);
		return new ResponseEntity<Factura>(factura, HttpStatus.OK);
	}
}
