/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.domain;

/**
 *
 * @author OPTIPLEX 9010
 */
public class Arreglo {

    public void arregloUnidimensional() {
        int[] edades = new int[3];
        System.out.println(edades);
        edades[0] = 10;
        edades[1] = 4;
        System.out.println(edades[0]);
        System.out.println(edades[1]);

        for (int i = 0; i < edades.length; i++) {
            System.out.println("i=" + i + " edad=" + edades[i]);
        }
    }

    public void arregloObjetos() {
        String nombres [] = {"hola", "mundo", "", ""};
        Persona[] personas = new Persona[3];
        personas[0] = new Persona("ximena");
        personas[1] = new Persona("vianca");
        System.out.println(personas);

        for (Persona persona : personas) {
            System.out.println(persona);
        }
        
        for (int i=0; i<nombres.length; i++) {
           System.out.println(nombres[i]);
        }

    }
}
