/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.domain.Pelicula;
import mx.com.excepciones.AccesoDatosEx;
import mx.com.excepciones.EscrituraDatosEx;
import mx.com.excepciones.LecturaDatosEx;

/**
 *
 * @author OPTIPLEX 9010
 */
public class AccesoDatosImp implements IAccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        File file = new File(nombreArchivo);
        return file.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        File file = new File(nombreArchivo);
        List<Pelicula> lista = new ArrayList<>();

        try {
            BufferedReader lectura = new BufferedReader(new FileReader(file));
            var data = lectura.readLine();
            while (data != null) {
                lista.add(new Pelicula(data));
                data = lectura.readLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al listar peliculas: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al listar peliculas: " + ex.getMessage());
        }

        return lista;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean agregar) throws EscrituraDatosEx {
        File file = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(file, agregar));
            salida.println(pelicula.getNombre());
            salida.close();
        } catch (FileNotFoundException fe) {
            fe.printStackTrace(System.out);
            throw new EscrituraDatosEx("Excepcion al escribir en el archivo: " + fe.getMessage());
        } catch (IOException e) {
            e.printStackTrace(System.out);
            throw new EscrituraDatosEx("Excepcion al escribir en el archivo: " + e.getMessage());
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx{
        try {
            File file= new File(nombreArchivo);
            BufferedReader lectura= new BufferedReader(new FileReader(file));
            var data=lectura.readLine();
            while (data!=null) {                
                if (data.equalsIgnoreCase(buscar)) {
                    return "El nombre de la pelicula existe";
                }
                data=lectura.readLine();
            }
            
            return "La pelicula no existe";
            
        } catch (IOException e) {
            e.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al buscar pelicula: "+e.getMessage());
        }
    }

    @Override
    public void crear(String nombreArchivo) throws EscrituraDatosEx {
        File file = new File(nombreArchivo);
        try {

            PrintWriter salida = new PrintWriter(file);
            salida.close();
            System.out.println("Archivo Creado");
        } catch (FileNotFoundException fe) {
            fe.printStackTrace(System.out);
            throw new EscrituraDatosEx("Excepcion al crear en el archivo: " + fe.getMessage());
        } catch (Exception e) {
            e.printStackTrace(System.out);
            throw new EscrituraDatosEx("Excepcion al crear en el archivo: " + e.getMessage());
        }
    }

    @Override
    public void eliminar(String nombreArchivo)throws AccesoDatosEx{
        try {
            File file= new File(nombreArchivo);
            file.delete();
        } catch (Exception e) {
            throw new AccesoDatosEx("Excepcion al eliminar archivo:"+e.getMessage());
        }
    }

}
