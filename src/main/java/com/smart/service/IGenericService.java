package com.smart.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface IGenericService<T, TDto> {

	public List<T> listar();
	public T listarId(Integer id);
	public T guardar(T t);
	public void eliminar(Integer id);
}
