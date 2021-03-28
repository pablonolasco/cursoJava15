/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com;

/**
 *
 * @author Windows10
 */
public enum Continentes {
   // EUROPA("48",2),
    ASIA("34"),
    AMERICA("1"),
    AFRICA("");
    private String nombre;
    
    //Continentes(String nombre, int total){
    Continentes(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
    
}
