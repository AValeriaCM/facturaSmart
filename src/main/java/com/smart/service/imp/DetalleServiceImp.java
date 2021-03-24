package com.smart.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.dto.DetalleDto;
import com.smart.entity.Detalle;
import com.smart.entity.Factura;
import com.smart.entity.Producto;
import com.smart.repo.IDetalleRepo;
import com.smart.repo.IFacturaRepo;
import com.smart.repo.IProductoRepo;
import com.smart.service.IDetalleService;

import com.smart.exception.ArgumentRequiredException;
import com.smart.exception.NotFoundException;

@Service
public class DetalleServiceImp implements IDetalleService{
	
	@Autowired
	private IDetalleRepo repoDetalle;
	
	@Autowired
	private IProductoRepo repoProducto;
	
	@Autowired
	private IFacturaRepo repoFactura;

	@Override
	public List<Detalle> listar() {
		return repoDetalle.findAll();
	}

	@Override
	public Detalle listarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Detalle guardar(Detalle det) {
		
		Detalle detalle = new Detalle();
		
		Factura factura = new Factura();
		
		Producto producto = new Producto();
		
		if(det.getProducto() == null) {
			throw new ArgumentRequiredException("Se requiere un producto para realizar esta accion!");
		} else {
			Producto prod = repoProducto.findById(det.getProducto().getId_producto()).orElseThrow(
					() -> new NotFoundException("Producto no existe"));

			detalle.setCantidad(det.getCantidad());
			detalle.setPrecio(det.getPrecio());
			detalle.setProducto(prod);
		}
		
		if(det.getFactura() == null) {
			throw new ArgumentRequiredException("Se requiere una factura para realizar esta accion!");
		} else {
			Factura fact = repoFactura.findById(det.getFactura().getNum_factura()).orElseThrow(
					() -> new NotFoundException("Factura no existe"));
			detalle.setId_factura(fact);
					
		}
		
		
		return repoDetalle.save(detalle);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Detalle guardarDto(DetalleDto detalleDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Detalle editarDto(DetalleDto detalleDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Detalle editarDetalle(Detalle cliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
