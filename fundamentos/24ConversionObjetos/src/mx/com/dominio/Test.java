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
        Empleado empleado = new Empleado("ximena1", 10);
        determinarTipo(empleado);
        Gerente gerente = new Gerente("ximena", 100, "admon");
        determinarTipo(gerente);
    }

    
    public static void determinarTipo(Empleado emp) {
        // Se empieza a preguntar desde el mas especifico al mas general
        // Para validar y hacer la conversion
        if (emp instanceof Gerente) {
            Gerente gerente=(Gerente)emp;
            System.out.println("Es de tipo Gerente "+gerente.getDepartamento());
        }
        else if (emp instanceof Empleado) {
            System.out.println("Es de tipo Empleado "+emp.getNombre());
        }
        else if (emp instanceof Object) {
            System.out.println("Es de tipo Object "+emp.toString());
        }
    }
}
