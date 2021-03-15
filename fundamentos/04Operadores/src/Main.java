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
        ternario();
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
}
