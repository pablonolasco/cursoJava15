/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos.metodos;

import fundamentos.ejercicio.Caja;

/**
 *
 * @author Windows10
 */
public class Main {
    public static void main(String[] args) {
        Aritmetica a1= new Aritmetica();
        a1.a=4;
        a1.b=8;
        a1.sumar();
        int result=a1.sumarConRetorno();
        
        System.out.println("result:"+result);
        
        result=a1.sumaConParametros(4, 4);
        
        System.out.println("result:"+result);
        
        Aritmetica aritmetica= new Aritmetica(10, 4);
        aritmetica.sumar();
        
        Caja c1= new Caja();
        c1.ancho=3;
        c1.alto=2;
        c1.profundo=6;
        
        double resultado=c1.calcularVolumen();
        System.out.println("resultado="+resultado);
        
    }
}
