/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos.ejercicio;

/**
 *
 * @author Windows10
 */
public class Caja {
    public double ancho;
    public double alto;
    public double profundo;

    public Caja() {
    }

    public Caja(double ancho, double alto, double profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public double calcularVolumen(){
        return this.ancho*this.alto*this.profundo;
    }
    
}
