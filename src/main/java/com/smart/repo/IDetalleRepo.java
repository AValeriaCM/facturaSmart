package com.smart.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.entity.Detalle;

@Repository
public interface IDetalleRepo extends JpaRepository<Detalle, Integer> {

}
