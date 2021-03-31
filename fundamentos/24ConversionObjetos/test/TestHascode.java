
import mx.com.dominio.Empleado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows10
 */
public class TestHascode {
    public static void main(String[] args) {
        Empleado empleado1= new Empleado("Ximena", 0);
        Empleado empleado2= new Empleado("ximena", 0);
        
        // Compara referencias
        if (empleado1== empleado2) {
            System.out.println("Referencias iguales");
        } else {
            System.out.println("Referencias distintas");
        }
        
        // Compara contenido
        if (empleado1.equals(empleado2)) {
            System.out.println("Contenido iguales");
        }else{
            System.out.println("Contenido diferente");
        }
        
        // Compara valores del has
        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("El valor hascode son iguales");
        } else {
            System.out.println("El valor hascode son distintos");
        }
        
    }
}
