
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
        
        int numeroInt=2147483647;
        System.out.println("int "+Integer.MAX_VALUE+" "+Integer.MIN_VALUE);
        System.out.println("valor: "+numeroInt);
        
        long enteroLargo=9223372036854775807L;
        System.out.println("long "+Long.MAX_VALUE+" "+Long.MIN_VALUE);
        System.out.println("valor: "+enteroLargo);
        
        float numeroFlot=3.4028235E38f;
        System.out.println("float "+Float.MAX_VALUE+" "+Float.MIN_VALUE);
        System.out.println("valor:"+numeroFlot);
        
        double numeroDoble=3.4028235E38;
        System.out.println("double "+Float.MAX_VALUE+" "+Float.MIN_VALUE);
        System.out.println("valor:"+numeroFlot);
        
        char caracter=64;
        char simbol='=';
        char varcaracter='A';
        
        System.out.println("valor: "+caracter+" "+Character.isUpperCase(caracter));
        System.out.println("simbol: "+simbol);
        
        boolean varBoolean=true;
        
        if (varBoolean) {
            System.out.println("valor:"+varBoolean);
        } else {
            System.out.println("valor:"+varBoolean);
        }
        
        var edad=18;
        var adulto=edad>=18;
        System.out.println((adulto)?"es mayor de edad":"es menor de edad");
    }
}
