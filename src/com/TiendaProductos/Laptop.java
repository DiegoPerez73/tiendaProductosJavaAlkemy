package com.TiendaProductos;

public class Laptop extends Producto{

    private double descuentoModificado;

    public Laptop(String tipoProducto, double precio, double descuento, double impuesto) {
        super(tipoProducto, precio, descuento, impuesto);

    }

    public Laptop(String tipoProducto, double precio, double descuento, double impuesto, double descuentoModificado) {
        super(tipoProducto, precio, descuento, impuesto);
        this.descuentoModificado = descuentoModificado;
    }

    public double getDescuentoModificado() {
        return descuentoModificado;
    }

    public void setDescuentoModificado(double descuentoModificado) {    //ESTO NO ME ANDA, LE ASIGNO EL SETTER, Y DOS CONSTRUCTORES PARA QUE ESTE LA OPCION DE ASIGNARLE YO EL DESCUENTO EXTRA
        this.descuentoModificado = descuentoModificado;
    }


    public void mostrarInfo(){
        System.out.println("\nTipo de producto: " + getTipoProducto());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Descuento: " + (getDescuento() + getDescuentoModificado()) );
        System.out.println("Impuesto: " + getImpuesto());
    }

    public void mostrarPrecioParcial() {
        System.out.println("El precio PARCIAL es: "+ precio);
    }

    public void mostrarPrecioFinal() {
        double precioFinal = precio - (descuento + descuentoModificado) + impuesto;
        System.out.println("El precio FINAL es: " + precioFinal);
    }
}
