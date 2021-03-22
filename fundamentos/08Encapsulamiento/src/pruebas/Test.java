/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import dominio.Persona;

/**
 *
 * @author Windows10
 */
public class Test {
    public static void main(String[] args) {
        Persona persona= new Persona("ximena",10,false);
        Persona persona2=new Persona("ola", 10, true);
        persona.setNombre("vianca");
      /*  System.out.println("nombre "+persona.getNombre());
        System.out.println("sueldo "+persona.getSueldo());
        System.out.println("existe "+persona.isEliminado());*/
        System.out.println(persona);
    }
}
