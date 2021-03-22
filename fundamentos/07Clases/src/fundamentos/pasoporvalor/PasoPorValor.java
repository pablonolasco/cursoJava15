/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos.pasoporvalor;

/**
 *
 * @author Windows10
 */
public class PasoPorValor {
    public static void main(String [] args){
        int x=10;
        System.out.println("x="+x);
        cambioValor(x);
        System.out.println("x nuevo="+x);
    }
    
    public static void cambioValor(int num){
        // Solo se pasa una copia del valor en las variables de tipo primitivo
        System.err.println("num="+num);
        num=15;
        
    }
    
}
