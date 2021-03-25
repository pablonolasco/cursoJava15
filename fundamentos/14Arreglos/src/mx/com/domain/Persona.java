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
public class Persona {
    private int idPersona;
    private String nombre;
    private static int contador;

    public Persona(String nombre) {
        this.idPersona = ++Persona.contador;
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{idPersona=").append(idPersona);
        sb.append(", nombre=").append(nombre);
        sb.append(", objeto=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
