package com.microservicios.springboot.app.productos.models.service;

import com.microservicios.springboot.app.productos.entity.Producto;

import java.util.List;

public interface IProductoService {
    public Producto findById(Long Id);
    public List<Producto>findAll();
}
