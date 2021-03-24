package com.smart.service;

import org.springframework.stereotype.Service;

import com.smart.dto.ClienteDto;
import com.smart.dto.DetalleDto;
import com.smart.entity.Cliente;
import com.smart.entity.Detalle;

@Service
public interface IDetalleService extends IGenericService<Detalle, DetalleDto>{
	public Detalle guardarDto(DetalleDto detalleDto);
	public Detalle editarDto(DetalleDto detalleDto);
	public Detalle editarDetalle(Detalle cliente);
}
