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
public class Aritmetica {
    int a;
    int b;
    
    // Constructor
    public Aritmetica(){
        System.out.println("constructor vacio");
    }
    
    // Constructor inicializando variables
    public Aritmetica(int a, int b){
        this.a=a;
        this.b=b;
    }
    
    public void sumar(){
        int resultado;
        resultado=a+b;
        System.out.println("suma:"+resultado);
    }
    
    public int sumarConRetorno(){
        return a+b;
    }
    
    public int sumaConParametros(int num1, int num2){
        return num1+num2;
    }
    
    
}
