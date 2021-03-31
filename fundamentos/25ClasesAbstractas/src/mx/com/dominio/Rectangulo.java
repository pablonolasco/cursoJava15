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
public class Rectangulo extends FiguraGeometrica{
    
    public Rectangulo(String nombreFigura, int lados){
        super(nombreFigura);
        this.lado=lados;
    }

    @Override
    protected void dibujar() {
        System.out.println("clase "+this.getClass().getSimpleName());
    }
    
}
