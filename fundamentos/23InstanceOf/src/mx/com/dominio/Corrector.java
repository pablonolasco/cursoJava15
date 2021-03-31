/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.dominio;

/**
 *
 * @author Windows10
 */
public class Corrector extends Escritor{
    public Corrector(String nombre, int sueldo){
        super(nombre, sueldo, TipoEscritura.CLASICA);
    }
}
