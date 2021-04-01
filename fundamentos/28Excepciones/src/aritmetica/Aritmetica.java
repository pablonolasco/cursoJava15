/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

import Excepciones.OperacionExcepcion;
import Excepciones.OperacionRuntimeException;

/**
 *
 * @author Windows10
 */
public class Aritmetica {
    public static int dividir(int numerador, int denominador) throws OperacionExcepcion{
        if(denominador == 0){
            throw new OperacionExcepcion("Division entre cero");
        }
        
        return numerador/denominador;
    }
    
    public static int dividirRuntimeException(int numerador, int denominador){
        if (denominador == 0) {
            throw new OperacionRuntimeException("Dividir runtime");
        }
        
        return numerador/denominador;
    }
}
