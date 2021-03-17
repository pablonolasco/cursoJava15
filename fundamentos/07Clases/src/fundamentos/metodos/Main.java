/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos.metodos;

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
    }
}
