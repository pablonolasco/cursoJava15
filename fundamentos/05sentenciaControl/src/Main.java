
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Windows10
 */
public class Main {

    public static void main(String[] args) {
        ciclos();
    }

    public static void metodoif() {
        var estatus = true;

        if (estatus) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }
        var a = 4;
        if (a == 1) {
            System.out.println("1");
        } else if (a == 2) {
            System.out.println("2");
        } else {
            System.out.println("ninguna opcion");
        }
    }

    public static void metodoSwitch() {
        var mes = 1;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa mes:");
        mes = leer.nextInt();
        var estacion = "sn";
        switch (mes) {
            case 1:
            case 2:
            case 11:
            case 12:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "primavera";
                break;
            default:
                estacion = "sin opcion";
                break;

        }

        System.out.println("estacion " + estacion);
    }

    public static void calificaciones() {
        var cal = 1.0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
        cal = leer.nextDouble();

        if (cal >= 0 && cal <= 5) {
            System.out.println("F");
        } else if (cal >= 6 && cal < 7) {
            System.out.println("D");
        } else if (cal >= 7 && cal < 8) {
            System.out.println("C");
        } else if (cal >= 8 && cal < 9) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
    
    public static void ciclos() {
        int i=0;
        while (i<10) {            
            System.out.println("i:"+i);
            i++;
        }
        i=0;
        do {            
            System.out.println("do");
            i++;
        } while (i<10);
        
        for(int j=0; j<10; j++){
            System.out.println("for");
        }
        
        for (int j = 1; j < 10; j++) {
            if (j%2==0) {
                System.out.println("numero par"+j);
                break;
            }
        }
        
        // Label
        par:
         for (int j = 1; j < 10; j++) {
            if (j%2!=0) {
              
                continue par;
            }
              System.out.println(j);
        }
    }

}
