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
public class Test {
    public static void main(String[] args) {
        Gerente gerente= new Gerente("ximena", 100, "admon");
        System.out.println(gerente.detalleEmpleado());
    }
}
