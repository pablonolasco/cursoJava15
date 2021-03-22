/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Windows10
 */
public class Persona {
    private int idPerosna;
    private String nombre;
    private static int contador=0;
    
    public Persona(String nombre){
        this.nombre=nombre;
        this.idPerosna=++Persona.contador;
    }

    public int getIdPerosna() {
        return idPerosna;
    }

    public void setIdPerosna(int idPerosna) {
        this.idPerosna = idPerosna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Persona.contador = contador;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPerosna=" + idPerosna + ", nombre=" + nombre + '}';
    }
    
    
}
