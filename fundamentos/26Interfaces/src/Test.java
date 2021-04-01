/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows10
 */
public class Test {
    public static void main(String[] args) {
        IADatos aDatos= new ImplementacionMySql();
        //aDatos.listar();
        imprimir(aDatos);
        aDatos= new ImplementacionOracle();
       // datos.listar();
        imprimir(aDatos);
    }
    
    public static void imprimir(IADatos aDatos){
        aDatos.listar();
    }
}
