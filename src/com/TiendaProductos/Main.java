package com.TiendaProductos;

public class Main {
    public static void main(String[] args) {

        Producto tel = new Telefono("Telefono",200, 20,10);

        tel.mostrarInfo();
        tel.mostrarPrecioParcial();
        tel.mostrarPrecioFinal();


        Producto laptop = new Laptop("Laptop",500,80,1);

    //  laptop.setDescuentoModificado();    //ESTO NO ME ANDA SI LO HAGO DE TIPO Producto .
        laptop.mostrarInfo();
        laptop.mostrarPrecioParcial();
        laptop.mostrarPrecioFinal();

        Laptop note = new Laptop("note",200, 20,10);

        note.setDescuentoModificado(25);    //ACA SI ME ANDA, ESTO SE DEBE A QUE SI LO HAGO DE TIPO PRODUCTO NO PUEDO UTILIZAR SETTERS PROPIOS DE CLASE LAPTOP?
                                            //O SE PUEDE PERO HAY QUE HACER COSAS EXTRAS? CUAL ES LA BUENA PRACTICA
        note.mostrarInfo();
        note.mostrarPrecioParcial();
        note.mostrarPrecioFinal();


        Producto tv = new Televisor("Televisor",1000,124.6,58, 1.2);


        tv.mostrarInfo();
        tv.mostrarPrecioParcial();
        tv.mostrarPrecioFinal();
    }
}
