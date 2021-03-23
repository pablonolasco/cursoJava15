/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerente;

import dominio.Persona;

/**
 *
 * @author Windows10
 */
public class Gerente extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contador;
    public Gerente( String nombre, char genero, int edad, String direccion,double sueldo) {
        super(nombre, genero, edad, direccion);
        this.idEmpleado=++Gerente.contador;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Gerente{" + "idEmpleado=" + idEmpleado +","+super.toString()+ ", sueldo=" + sueldo + '}';
    }
    
    
    
}
