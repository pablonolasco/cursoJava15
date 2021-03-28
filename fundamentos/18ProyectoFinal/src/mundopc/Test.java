/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;

import mx.com.gm.mundopc.Computadora;
import mx.com.gm.mundopc.Monitor;
import mx.com.gm.mundopc.Orden;
import mx.com.gm.mundopc.Raton;
import mx.com.gm.mundopc.Teclado;

/**
 *
 * @author Windows10
 */
public class Test {

    public static void main(String[] args) {
        Computadora computadora = new Computadora("hp", new Monitor("hp", 1000),
                new Teclado("usb", "logitech"), new Raton("usb", "hp"));
        Computadora computadora2 = new Computadora("asus", new Monitor("samsung", 1000),
                new Teclado("usb", "logitech"), new Raton("usb", "hp"));
        Orden orden = new Orden();
        orden.agregarComputadora(computadora);
        orden.agregarComputadora(computadora2);
        orden.mostrarOrden();
    }

}
