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
public abstract class FiguraGeometrica {
    protected String tipoFigura;
    protected int lado;
    
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura=tipoFigura;
    }
    
    protected abstract void dibujar();
    
    public void lado(){
        System.out.println("Clase: "+getClass().getSimpleName()+", lados:"+this.lado);
    }

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
    
    
}
