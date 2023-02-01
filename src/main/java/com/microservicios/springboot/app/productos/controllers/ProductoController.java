package com.microservicios.springboot.app.productos.controllers;

import com.microservicios.springboot.app.productos.entity.Producto;
import com.microservicios.springboot.app.productos.models.service.IProductoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class ProductoController {
    private final IProductoService iProductoService;
    public ProductoController(IProductoService productoService){
        this.iProductoService = productoService;
    }

    @GetMapping("/buscar/{Id}")
    public Producto busarProducto(@PathVariable long Id) throws InterruptedException {
        if (Id == 10L){
            throw new IllegalStateException("Producto no valido.");
        }
        if (Id == 3L){
            TimeUnit.SECONDS.sleep(5L);
        }
        return iProductoService.findById(Id);
    }
    @GetMapping("/mostrar")
    public List<Producto>mostrarProductos(){
        return iProductoService.findAll();
    }
}
