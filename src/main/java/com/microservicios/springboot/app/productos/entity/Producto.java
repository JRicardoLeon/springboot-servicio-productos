package com.microservicios.springboot.app.productos.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Nombre;
    private Double Precio;
    @Column(name = "create_At")
    @Temporal(TemporalType.DATE)
    private Date CreateAt;

    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public Double getPrecio() {
        return Precio;
    }
    public void setPrecio(Double precio) {
        Precio = precio;
    }
    public Date getCreateAt() {
        return CreateAt;
    }
    public void setCreateAt(Date createAt) {
        CreateAt = createAt;
    }
}
