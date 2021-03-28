/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.mundopc;

/**
 *
 * @author Windows10
 */
public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS=4;

    public Orden() {
        this.idOrden=++Orden.contadorOrdenes;
        this.computadoras= new Computadora[MAX_COMPUTADORAS];
       
    }
    
    public void agregarComputadora(Computadora computadora){
        if (this.contadorComputadoras<Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++]=computadora;
        } else {
            System.out.println("Se ha llegado al limite "+Orden.MAX_COMPUTADORAS);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Orden:"+this.idOrden);
        for(Computadora computadora: this.computadoras)
            System.out.println(computadora);
    }
    
    
}
