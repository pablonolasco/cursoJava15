
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
        // asignar();
        //unarios();
        //igualdad();
        //relacionales();
        //ternario();
        //procedencia();
        //rectangulo();
        mayor();
    }

    public static void asignar() {
        int a = 3, b = 2, c = a + 5 - b;

        System.out.println("c:" + c);
        a += 1;
        System.out.println("a:" + a);
        b -= 1;
        System.out.println("b:" + b);
        c /= 2;
        System.out.println("c:" + c);
        a *= 9;
        System.out.println("a:" + a);
    }

    public static void unarios() {
        var c = true;
        var d = !c;
        // Negacion
        System.out.println("c:" + d);
        // Incremento
        // preincremento
        var e = 4;
        var f = ++e;

        System.out.println("f:" + f);

        var g = 3;
        var h = g++;

        System.out.println("h:" + h);
    }

    public static void igualdad() {
        int a = 4;
        int b = 4;

        if (a == b) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        String palabra = "hola";
        String palabra2 = "Hola";

        // Compara referencias
        if (palabra == palabra2) {
            System.out.println("palabras iguales");
        } else {
            System.out.println("no son palabras iguales");
        }

        // Compara contenido
        if (palabra.equals(palabra2)) {
            System.out.println("palabras iguales");
        } else {
            System.out.println("no son palabras iguales");
        }

        // Es par
        if (a % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

        if (a >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

    }

    public static void relacionales() {
        int a = 11;

        if (a >= 0 && a <= 10) {
            System.out.println("Esta en el rango");
        } else {
            System.out.println("Fuera de rango");
        }

        boolean vacaciones = false;
        boolean diasDescanso = true;
        if (vacaciones || diasDescanso) {
            System.out.println("Puede ir a ver el partido");
        } else {
            System.out.println("No puede ir a ver el partido");
        }
    }

    public static void ternario() {
        int a = 18;

        boolean resultado = (a >= 18) ? true : false;

        if (resultado) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

    public static void procedencia() {
        int x = 5;
        int y = 10;
        int z = ++x + y--;
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        System.out.println("z:" + z);

        int r = 4 + 5 * 6 / 3;
        System.out.println("r:" + r);

    }

    public static void rectangulo() {
        int alto;
        int ancho;
        Scanner leer = new Scanner(System.in);
        System.out.println("Proporciona el alto:");
        alto = leer.nextInt();
        System.out.println("Proporciona el ancho:");
        ancho = leer.nextInt();

        System.out.println("Area:" + (alto * ancho));
        System.out.println("Perimetro:" + ((alto + ancho) / 2));
    }

    public static void mayor() {
        int num1;
        int num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        num1 = leer.nextInt();
        System.out.println("Proporciona el numero2:");
        num2 = leer.nextInt();
        if (num1 > num2) {
            System.out.println("El numero mayor es:" + num1);
        } else {
            System.out.println("El numero mayor es:" + num2);

        }

    }
}
