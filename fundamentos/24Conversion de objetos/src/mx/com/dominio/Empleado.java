/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.dominio;

/**
 *
 * @author Windows10
 */
public class Empleado {
    
    private static final int idEmpleado;
    private static int contador;
    private String nombre;
    private int sueldo;
    
    static{
        idEmpleado=++contador;
    }

    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    protected String detalleEmpleado(){
        return "nombre: "+this.nombre+" sueldo: "+this.sueldo;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{id=").append(idEmpleado);
        sb.append(", nombre=").append(nombre);
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }
    
    
}
