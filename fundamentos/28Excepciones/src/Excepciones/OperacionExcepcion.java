/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Windows10
 */
public class OperacionExcepcion extends Exception{
    // Exception check, se obliga al metodo a colocar el throws en la firma del metodo
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    } 
}
