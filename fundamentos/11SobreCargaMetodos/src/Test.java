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
        var result1=Operaciones.suma(4, 4);
        System.out.println("result1="+result1);
        
        var result2=Operaciones.suma(4.0, 4);
        System.out.println("result2="+result2);
        
        var result3=Operaciones.suma(4, 4L);
        System.out.println("result3="+result3);
        
        
        
        
    }
}
