
import Excepciones.OperacionExcepcion;

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
            double result=aritmetica.Aritmetica.dividir(10, 0);
            // Para colocar mas expeciones se colocan de lo particular a lo general
        }catch(OperacionExcepcion oe){
            System.out.println(oe.getMessage());
        }catch (Exception e) {
            System.out.println("Ocurrior un error");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Siempre se ejecuta");
        }
    }
}
