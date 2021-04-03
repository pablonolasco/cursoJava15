/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.negocio;

import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.datos.AccesoDatosImp;
import mx.com.datos.IAccesoDatos;
import mx.com.domain.Pelicula;
import mx.com.excepciones.AccesoDatosEx;
import mx.com.excepciones.EscrituraDatosEx;
import mx.com.excepciones.LecturaDatosEx;

/**
 *
 * @author OPTIPLEX 9010
 */
public class CatalogoPeliculaImpl implements ICatalogoPelicula {

    private IAccesoDatos datos;

    public CatalogoPeliculaImpl() {
        datos = new AccesoDatosImp();
    }

    @Override
    public void agregarPelicula(String nombre, String nombreArchivo) {
        try {
            this.datos.escribir(new Pelicula(nombre), nombreArchivo, true);
        } catch (EscrituraDatosEx e) {
            System.err.println("Error al agregarPelicula:" + e.getMessage());
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        try {
            System.out.println(this.datos.listar(nombreArchivo));
        } catch (LecturaDatosEx e) {
            System.err.println("Error al listarPeliculas:"+e.getMessage());
        }
    }

    @Override
    public void buscarPeliculas(String nombreArchivo, String buscar) {
        try {
            var result=this.datos.buscar(nombreArchivo, buscar);
            System.out.println(result);
        } catch (LecturaDatosEx e) {
            System.err.println("Error al buscarPeliculas:"+e.getMessage());
        }
    }

    @Override
    public void iniciarArchivo(String archivo) {
        try {
            if (this.datos.existe(archivo)) {
                this.datos.eliminar(archivo);
            }else{
                this.datos.crear(archivo);
            }

        } catch (AccesoDatosEx ex) {
            System.err.println("Error iniciarArchivo:" + ex.getMessage());
        }
    }

}
