/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos.This;

/**
 *
 * @author Windows10
 */
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona= new Persona("Pablo", "Nolasco");
        System.out.println("Persona "+persona);
        System.out.println("nombre "+persona.nombre);
    }
    
}

class Persona{
    String nombre;
    String apellido;

    public Persona(String nombre, String apellido) {
        System.out.println("constructor "+this);
        this.nombre = nombre;
        this.apellido = apellido;
        // creacion de objeto
        new Imprimir().imprimir(this);
    }
    
    
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("Imprimir "+persona);
        // se manda a llamar un objeto de tipo imprimir por que se creo el objeto imprimir
        System.out.println("impresion del objeto actual "+this);
    }
}
