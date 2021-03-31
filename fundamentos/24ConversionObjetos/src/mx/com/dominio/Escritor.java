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
public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;
     public Escritor(String nombre, int suueldo, TipoEscritura escritura1){
         super(nombre, suueldo);
         this.tipoEscritura=escritura1;
     }
     
     @Override
     public String detalleEmpleado(){
         return super.detalleEmpleado()+" tipo escritura:"+this.tipoEscritura.getTipo();
     }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    @Override
    public String toString() {
        return "Escritor{"+super.toString() +", "+ "tipoEscritura=" + tipoEscritura + '}';
    }
     
     
}
