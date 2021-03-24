package com.smart.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.smart.dto.ProductoDto;
import com.smart.entity.Producto;

@Service

public interface IProductoService extends IGenericService<Producto, ProductoDto>{
	
	public Producto guardarDto(ProductoDto productoDto);
	public Producto editarDto(ProductoDto productoDto);
	public Producto editarProducto(Producto producto);
	//public List<Producto> listaFincaPorIdUsuario(Integer idUsuario);

}
