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
public class Test {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("ximena1", 10);
        
        // Dowcasting
        empleado= new Escritor("ximena", 100,TipoEscritura.CLASICA);
        System.out.println(empleado);
        
        // Convertir un objeto padre a hija Dowcasting, hacia abajo
        // ((Escritor)empleado).getTipoEscritura();
        Escritor escritor=(Escritor)empleado;
        
        //  Upcasting
        // Convertir una objeto tipo hija a un padre
        // hacia arriba
        Empleado empleado1=escritor;
        System.out.println(empleado1);
    }

    
    
}
