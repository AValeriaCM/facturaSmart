package com.smart.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.entity.Cliente;
import com.smart.entity.Factura;
import com.smart.repo.IFacturaRepo;
import com.smart.service.IFacturaService;


@Service
public class FacturaServiceImp implements IFacturaService{
	
	@Autowired
	private IFacturaRepo repoFactura;

	@Override
	public List<Factura> listar() {
		return repoFactura.findAll();
	}

	@Override
	public Factura listarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Factura guardar(Factura fact) {
		
		Factura factura = new Factura();
		
		factura.setCliente(fact.getCliente());
		factura.setFecha(fact.getFecha());

		return repoFactura.save(factura);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
