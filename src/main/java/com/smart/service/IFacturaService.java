package com.smart.service;

import org.springframework.stereotype.Service;

import com.smart.dto.FacturaDto;
import com.smart.entity.Factura;

public interface IFacturaService extends IGenericService<Factura, Integer> {
	
	public Factura guardarDto(FacturaDto facturaDto);
	public Factura editarDto(FacturaDto facturaDto);
	public Factura editarFactura(Factura factura);

}
