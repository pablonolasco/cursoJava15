/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.dominio;

/**
 *
 * @author OPTIPLEX 9010
 */
public class Orden {

    private int idOrden;
    private static int contador;
    private static final int MAX_PRODUCTOS = 4;
    private int contadorProducto = 0;
    private Producto productos[];

    public Orden() {
        this.idOrden = ++Orden.contador;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProducto < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProducto++] = producto;
        }else{
            System.out.println("Se ha superado la cantidad de productos "+Orden.MAX_PRODUCTOS);
        }

    }

    public double calcularTotal() {
        double resultado = 0;

        for (Producto producto : this.productos) {
            resultado += producto.getPrecio();
        }

        return resultado;
    }

    public void mostrarOrden() {
        System.out.println("Orden:" + this.idOrden);
        System.out.println("Productos:");
        for (Producto producto : this.productos) {
            System.out.println(producto);
        }
        System.out.println("Total:" + this.calcularTotal());
    }
    
}
