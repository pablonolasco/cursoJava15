/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Windows10
 */
public class TestArgumento {
    public static void main(String[] args) {
        argumentos("argumento", 4,8,10);
        argumento(8,14);
    }
    
    public static void argumentos(String nombre, int... numeros){
        System.out.println(nombre);
        for(int numero: numeros)
            System.out.println(numero);
    }
    public static void argumento(int... numeros){
        for(int numero:numeros)
            System.out.println(numero);
    }
}
