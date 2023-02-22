package com.example.RYArgentina.model.DTO;

import com.example.RYArgentina.model.Productos;

public class ProductoResponseDTO {

    private Productos producto;
    private Integer cantidad;


    public ProductoResponseDTO() {
    }

    public ProductoResponseDTO(Productos producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
