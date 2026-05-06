package com.pruebaintegracion;

/**
 * Clase que representa un producto descargable o virtual.
 * Al no ser físico, no tiene peso ni costes de envío asociados.
 */
public class ProductoDigital extends Producto {
    
    private String codigoLicencia;
    private double impuestoIVA;

    /**
     * Constructor para ProductoDigital
     * @param nombre Nombre del software, e-book, etc.
     * @param precioBase Precio sin impuestos.
     * @param codigoLicencia Identificador único de la licencia.
     */
    public ProductoDigital(String nombre, double precioBase, String codigoLicencia) {
        super(nombre, precioBase);
        this.codigoLicencia = codigoLicencia;
        this.impuestoIVA = 0.21; // Por defecto aplicamos el 21%
    }

    /**
     * Implementación del método abstracto.
     * En el caso digital, el precio final es: Precio Base + IVA.
     */
    @Override
    public double calcularPrecioFinal() {
        return precioBase + (precioBase * impuestoIVA);
    }

    /**
     * Permite cambiar el IVA si el producto se vende en otra región (ej. Canarias o extranjero).
     * @param nuevoIva valor decimal (ej. 0.07 para el 7%).
     */
    public void setImpuestoIVA(double nuevoIva) {
        if (nuevoIva >= 0) {
            this.impuestoIVA = nuevoIva;
        }
    }

    public String getCodigoLicencia() {
        return codigoLicencia;
    }

    @Override
    public String toString() {
        return "ProductoDigital{" +
                "nombre='" + nombre + '\'' +
                ", licencia='" + codigoLicencia + '\'' +
                ", precioTotal=" + calcularPrecioFinal() +
                '}';
    }
}