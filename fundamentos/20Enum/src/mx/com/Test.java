/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com;

/**
 *
 * @author Windows10
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("continente:"+Continentes.ASIA.getNombre());
        dias(Dias.LUNES);
    }
    
    public static void dias(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("LUNES");
                break;
                
                default:
                    System.out.println("sin coincidencias");
                    break;
        }
    }
}
