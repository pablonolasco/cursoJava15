/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.datos;

import mx.com.domain.Pelicula;
import java.util.*;
import mx.com.excepciones.AccesoDatosEx;
import mx.com.excepciones.EscrituraDatosEx;
import mx.com.excepciones.LecturaDatosEx;

/**
 *
 * @author OPTIPLEX 9010
 */
public interface IAccesoDatos {

    boolean existe(String nombreArchivo) throws AccesoDatosEx;

    List<Pelicula> listar(String nombre) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreArchivo, boolean agregar) throws EscrituraDatosEx;

    String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

    void crear(String nombreArchivo) throws AccesoDatosEx;

    void eliminar(String nombreArchivo) throws AccesoDatosEx;
}
