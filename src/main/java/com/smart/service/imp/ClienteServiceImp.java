package com.smart.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.dto.ClienteDto;
import com.smart.dto.ProductoDto;
import com.smart.entity.Cliente;
import com.smart.entity.Factura;
import com.smart.entity.Producto;
import com.smart.repo.IClienteRepo;
import com.smart.service.IClienteService;
import com.smart.service.IProductoService;

@Service
public class ClienteServiceImp implements IClienteService{

	@Autowired(required = true)
	private IClienteRepo repoCliente;

	@Override
	public List<Cliente> listar() {
		return repoCliente.findAll();
	}

	@Override
	public Cliente listarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente guardar(Cliente cli) {
		
		Cliente cliente = new Cliente();
		cliente.setNombre(cli.getNombre());
		cliente.setApellido(cli.getApellido());
		cliente.setDireccion(cli.getDireccion());
		cliente.setEmail(cli.getEmail());
		cliente.setFecha_nacimiento(cli.getFecha_nacimiento());
		cliente.setTelefono(cli.getTelefono());
		
		if(cli.getListaFacturas() != null) {
			for(Factura factura: cli.getListaFacturas()) {
				factura.setCliente(cli);
			}		
		}
		
		return repoCliente.save(cliente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente guardarDto(ClienteDto clienteDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente editarDto(ClienteDto clienteDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente editarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}
}