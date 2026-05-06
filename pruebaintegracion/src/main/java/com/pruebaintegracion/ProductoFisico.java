package com.pruebaintegracion;

public class ProductoFisico extends Producto {
    private double peso;

    public ProductoFisico(String nombre, double precioBase, double peso) {
        super(nombre, precioBase);
        this.peso = peso;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase + (peso * 2.0);
    }
}
