/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.dominio;

/**
 *
 * @author Windows10
 */
public class Persona {
    public final int idPersona;
    private static int contadorPersona;
    
    static{
        System.out.println("variables estaticas");
        ++contadorPersona;
    }
    
    {
        System.out.println("no estatico");
        this.idPersona=++contadorPersona;
    }

    public Persona() {
        System.out.println("constructor");
    }
    
    
}
