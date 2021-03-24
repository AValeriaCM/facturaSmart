package com.smart.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.smart.entity.Factura;

public interface IFacturaRepo extends JpaRepository<Factura, Integer>{

	Factura findOneByNick(String nick);
	boolean existsByNick(String nick);
	
}
