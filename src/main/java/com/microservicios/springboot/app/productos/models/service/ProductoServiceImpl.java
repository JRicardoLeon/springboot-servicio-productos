package com.microservicios.springboot.app.productos.models.service;

import com.microservicios.springboot.app.productos.entity.Producto;
import com.microservicios.springboot.app.productos.models.dao.ProductoDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ProductoServiceImpl implements IProductoService{
    @Autowired
    private final ProductoDao productoDao;

    public ProductoServiceImpl(ProductoDao productoDao) {
        this.productoDao = productoDao;
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findById(Long Id) {
       return productoDao.findById(Id).orElse(null);
    }
    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return  productoDao.findAll();
    }
}
