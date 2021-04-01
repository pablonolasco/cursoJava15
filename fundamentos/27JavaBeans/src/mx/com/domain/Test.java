/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.domain;

/**
 *
 * @author Windows10
 */
public class Test {
    public static void main(String[] args) {
        Persona persona= new Persona();
        persona.setNombre("ximena");
        persona.setApellido("apellido");
        
        System.out.println("Nombre:"+persona.getNombre());
        System.out.println("Apellido:"+persona.getApellido());
    }
}
