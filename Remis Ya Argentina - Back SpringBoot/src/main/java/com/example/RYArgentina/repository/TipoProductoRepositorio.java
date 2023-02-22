package com.example.RYArgentina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RYArgentina.model.TipoProducto;

@Repository
public interface TipoProductoRepositorio extends JpaRepository<TipoProducto, Long>{

    Boolean existsByDescripcion(String description);
}
