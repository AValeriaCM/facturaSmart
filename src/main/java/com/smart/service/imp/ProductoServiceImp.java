package com.smart.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.dto.ProductoDto;
import com.smart.entity.Producto;
import com.smart.repo.IProductoRepo;
import com.smart.service.IProductoService;


@Service
public class ProductoServiceImp implements IProductoService{

	@Autowired
	private IProductoRepo productoRepo;
	
	@Override
	public List<Producto> listar() {
		return productoRepo.findAll();
	}

	@Override
	public Producto listarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto guardar(Producto prod) {
		
		Producto producto = new Producto();
		
		producto.setNombre(prod.getNombre());
		producto.setPrecio(prod.getPrecio());
		producto.setStock(prod.getStock());
		
		return productoRepo.save(producto);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto guardarDto(ProductoDto productoDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto editarDto(ProductoDto productoDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto editarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
