/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos.returns;

import fundamentos.ejercicio.Caja;

/**
 *
 * @author Windows10
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        Caja caja= new Caja();
        caja.alto=10;
      
        System.out.println("alto="+caja.alto);
        caja=cambiarValor(caja);
        System.out.println("alto nuevo="+caja.alto);
    }
    
    public static Caja cambiarValor(Caja caja){
        System.out.println("cambio="+caja.alto);
        caja.alto=14;
        if ( caja == null) {
            return caja;
        }
        return caja;
    }
    
}
