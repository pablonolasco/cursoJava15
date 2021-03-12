
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OPTIPLEX 9010
 */
public class Main {
    public static void main(String[] args) {
      metodoTipos();
    }
    
    public static void metodoScanner(){
          String nombre;
        var apellido="";
        Scanner leer= new Scanner(System.in);
        System.out.println("Escribe tu nombre:");
        nombre=leer.next();
        System.out.println("Escribe tu apellido:");
        apellido=leer.next();
        
        System.out.println("\n\n"+nombre+" "+apellido);
    }
    
    public static void metodoTipos(){
        /*
        tipos primitivos enteros byte, short, int, long
        */
        byte bite=(byte)129;
        System.out.println("byte "+Byte.MAX_VALUE+" "+Byte.MIN_VALUE);
        System.out.println("valor:"+bite);
        
        short numero_short=(short)32768;
        System.out.println("short "+Short.MAX_VALUE+" "+Short.MIN_VALUE);
        System.out.println("valor:"+numero_short);
        
    }
}
