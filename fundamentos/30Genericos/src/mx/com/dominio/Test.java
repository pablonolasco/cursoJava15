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
public class Test {
    public static void main(String[] args) {
        // el tipo de dato de la izq debe de ser igual al de la derecha
        // puedes crear un tipo IE siempre y cuando esa clase lo implemente 
        ClaseGenerica<Integer> generica= new ClaseGenerica(4);
        generica.obtenerTipo();
        
        ClaseGenerica<String>generica1= new ClaseGenerica("hola");
        generica1.obtenerTipo();
        
    }
}
