/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.dominio;

/**
 *
 * @author OPTIPLEX 9010
 */
public class Matrices {
    public void matrices(){
        int [][]edades= new int[3][2];
        System.out.println(edades);
        edades[0][1]=7;
        edades[1][0]=4;
        edades[2][1]=8;
        
        for(int [] edad: edades){
            for(int num: edad)
            System.out.println(num);
        }
        
        String [][] frutas={{"Naranja","Limon"},{"Pera","Melon"},{"",""},{"",""}};
        for(String[] fruta:frutas){
            for(String nombre:fruta)
                System.out.println(nombre);
        }
    }
    
    public void matricesObjetos(){
        Persona [][]personas= new Persona[3][2];
        personas[0][1]=new Persona("ximena");
        personas[1][1]=new Persona("vianca");
        personas[2][0]=new Persona("o");
        this.imprimir(personas);
       
    }
    
    private static void imprimir(Persona personas [][]){
         for(Persona []person: personas){
            for(Persona nombre: person)
                System.out.println(nombre);
        }
    }
}
