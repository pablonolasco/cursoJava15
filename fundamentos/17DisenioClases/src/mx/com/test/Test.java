/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.test;

import mx.com.dominio.Orden;
import mx.com.dominio.Producto;

/**
 *
 * @author OPTIPLEX 9010
 */
public class Test {
    public static void main(String[] args) {
        Orden orden= new Orden();
        Producto producto1=new Producto("sabritas", 10);
        Producto producto2= new Producto("pan", 4);
        Producto producto3= new Producto("paleta", 2);
        Producto producto4= new Producto("dulce", 8);
        
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);
        orden.agregarProducto(producto3);
        orden.agregarProducto(producto4);
        
        orden.mostrarOrden();
    }
    
}
