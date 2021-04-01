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
        try {
            double result=4/0;
        } catch (Exception e) {
            System.out.println("Ocurrior un error");
            e.printStackTrace(System.out);
        }
    }
}
