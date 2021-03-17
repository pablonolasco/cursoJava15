/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows10
 */
public class Main {
    public static void main(String[] args) {
        Persona p1= new Persona();
        p1.nombre="Pablo";
        p1.apellido="Nolasco";
        p1.desplegarInformacion();
        
        Persona p2= new Persona();
        p2.nombre="Aria";
        p2.apellido="Nolasco";
        System.out.println("p2:"+p2);
    }
}
