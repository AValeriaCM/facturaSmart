package com.smart.service;

import org.springframework.stereotype.Service;

import com.smart.dto.ClienteDto;
import com.smart.entity.Cliente;

@Service
public interface IClienteService extends IGenericService<Cliente, ClienteDto>{

	public Cliente guardarDto(ClienteDto clienteDto);
	public Cliente editarDto(ClienteDto clienteDto);
	public Cliente editarCliente(Cliente cliente);
}
