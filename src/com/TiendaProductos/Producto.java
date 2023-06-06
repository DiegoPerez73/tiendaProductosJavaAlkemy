package com.TiendaProductos;

public abstract class Producto implements ProductoInterface {

    protected String tipoProducto;      //Es correcto utilizar protected/public en las clases Abstractas,
                                        // o hay una forma de usarlas private. (Intente con private y no pude solucionar los errores que arrastro).
    protected double precio;
    protected double descuento;
    protected double impuesto;

    public Producto(String tipoProducto, double precio,double descuento,double impuesto ){
        this.tipoProducto = tipoProducto;
        this.precio = precio;
        this.descuento = descuento;
        this.impuesto = impuesto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getImpuesto() {
        return impuesto;
    }


}
