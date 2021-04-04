/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.dominio;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import mx.com.dao.PersonaDAO;
import mx.com.model.Persona;

/**
 *
 * @author Windows10
 */
public class TestJDBC {

    public static void main(String[] args) {
        try {
            PersonaDAO personaDAO = new PersonaDAO();
            //List<Persona> listaPersona = personaDAO.obtenerLista();
            Persona persona = new Persona("desa", "des", "example@example.com", 11);
            Persona persona2 = new Persona(5, "desa", "des", "des@example.com", 44);
            Persona persona3 = new Persona(5);
            imprimir(personaDAO.obtenerLista());

            //   personaDAO.insertarPersona(persona);
            System.out.println("");
            imprimir(personaDAO.obtenerLista());
            System.out.println("");
            //    personaDAO.actualizarPersona(persona2);
            imprimir(personaDAO.obtenerLista());
            System.out.println("");
            personaDAO.eliminarPersona(persona3);
            imprimir(personaDAO.obtenerLista());
            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

    }

    public static void imprimir(List<Persona> listaPersona) {

        listaPersona.forEach(person -> {
            System.out.println(person);
        });
    }
}
