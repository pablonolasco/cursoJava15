/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OPTIPLEX 9010
 */
public class Main {
    
    public static void main(String[] args) {
        // Declaracion de variables;
        var miVariable1=1;
        var _miVariable=2;
        var $miVariable=2;
        // No se recomienda
        var áVariable=2;
        
        // Caracteres especiales ilegales
        // var #variable=2;
        
        int numero=10;
        String cadena="Hola";
        // Inferencia de tipos solo para la version 10 en adelante del jdk de java
        var miVariable=15;
        var cadena2="mundo";
        System.out.println(miVariable);
        System.out.println(cadena2);
        
        var usuario="Juan";
        var tittle="Ingeniero";
        
        var union=tittle+" "+usuario;
        
        var i=3;
        var j=4;
        
        System.out.println("suma="+i+j);
        System.out.println("union="+union);
        
        // Caracteres especiales
        System.out.println("Nueva linea: \n"+union);
        System.out.println("Tabuladro: \t"+union);
        System.out.println("Retroceso: \b\b"+union);
        System.out.println("Comilla simple: \'"+union+"\'");
        System.out.println("Comilla simple: \""+union+"\"");
        
        
    }
    
}
