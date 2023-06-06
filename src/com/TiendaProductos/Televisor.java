package com.TiendaProductos;

public class Televisor extends Producto{

    private double impuestoModificado;

    public Televisor(String tipoProducto, double precio, double descuento, double impuesto) {
        super(tipoProducto, precio, descuento, impuesto);
    }

    public Televisor(String tipoProducto, double precio, double descuento, double impuesto, double impuestoModificado) {
        super(tipoProducto, precio, descuento, impuesto);
        this.impuestoModificado = impuestoModificado;
    }

    public double getImpuestoModificado() {
        return impuestoModificado;
    }

    public void setImpuestoModificado(double impuestoModificado) {
        this.impuestoModificado = impuestoModificado;
    }

    public void mostrarInfo(){
        System.out.println("\nTipo de producto: " + getTipoProducto());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Descuento: " + getDescuento());
        System.out.println("Impuesto: " + (getImpuesto() + getImpuestoModificado())  );
    }

    public void mostrarPrecioParcial() {
        System.out.println("El precio PARCIAL es: "+ precio);
    }


    public void mostrarPrecioFinal() {
        double precioFinal = precio - descuento + (impuesto / impuestoModificado);
        System.out.println("El precio FINAL es: "+precioFinal);
    }
}
