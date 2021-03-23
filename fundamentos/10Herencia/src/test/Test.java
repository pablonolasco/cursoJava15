/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import cliente.Cliente;
import gerente.Gerente;

/**
 *
 * @author Windows10
 */
public class Test {
    public static void main(String[] args) {
        Gerente gerente1= new Gerente("pablo",'M',30,"ecatepec",28000);
        Gerente gerente2= new Gerente("ximena",'F',25,"cdmx",20000);
        Cliente cliente1= new Cliente("vianca", true);
        Cliente cliente2= new Cliente("ok", true);
        System.out.println(gerente1);
        System.out.println(gerente2);
        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
