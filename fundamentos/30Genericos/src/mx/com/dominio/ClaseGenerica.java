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
public class ClaseGenerica<T> {
    
    private T objeto;
    
    public ClaseGenerica(T tipo){
        this.objeto=tipo;
    }
    
    public void obtenerTipo(){
        System.out.println("tipo de clase: "+this.objeto.getClass().getSimpleName());
    }
}
