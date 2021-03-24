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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Factura listarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Factura guardar(Factura t) {
		
		
		
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
