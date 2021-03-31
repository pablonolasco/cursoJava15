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
public enum TipoEscritura {
    CLASICA("Escritura a mano"),
    MODERNA("Escritura digital");
    
    private final String tipo;

    private TipoEscritura(String tipo) {
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
    
    
    
}
