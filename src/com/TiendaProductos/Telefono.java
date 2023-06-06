package com.TiendaProductos;

public class Telefono extends Producto{


    public Telefono(String tipoProducto, double precio, double descuento, double impuesto) {
        super(tipoProducto, precio, descuento, impuesto);
    }

    public void mostrarInfo(){

        System.out.println("\nTipo de producto: " + getTipoProducto());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Descuento: " + getDescuento());
        System.out.println("Impuesto: " + getImpuesto());
    }

    public void mostrarPrecioParcial(){
        System.out.println("El precio Parcial es: "+ precio);
    }

    public void mostrarPrecioFinal() {
    double precioFinal = precio - descuento + impuesto;
        System.out.println("El precio FINAL es: " + precioFinal);
    }

}
