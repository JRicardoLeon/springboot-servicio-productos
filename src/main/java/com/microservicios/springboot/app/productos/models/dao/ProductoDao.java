package com.microservicios.springboot.app.productos.models.dao;

import com.microservicios.springboot.app.productos.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProductoDao extends JpaRepository<Producto, Long> {
}
