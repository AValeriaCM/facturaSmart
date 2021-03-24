package com.smart.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.smart.entity.Producto;

@Repository
public interface IProductoRepo extends JpaRepository<Producto, Integer>{
	
	Producto findFirstByNombre(String nombre);
}
