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

    private final IAccesoDatos datos;

    public CatalogoPeliculaImpl() {
        datos = new AccesoDatosImp();
    }

    @Override
    public void agregarPelicula(String nombre) {
        try {
            this.datos.escribir(new Pelicula(nombre), NOMBRE_ARCHIVO, this.datos.existe(NOMBRE_ARCHIVO));
        } catch (AccesoDatosEx ex) {
            Logger.getLogger(CatalogoPeliculaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            System.out.println(this.datos.listar(NOMBRE_ARCHIVO));
        } catch (LecturaDatosEx e) {
            System.err.println("Error al listarPeliculas:"+e.getMessage());
        }
    }

    @Override
    public void buscarPeliculas(String buscar) {
        try {
            var result=this.datos.buscar(NOMBRE_ARCHIVO, buscar);
            System.out.println(result);
        } catch (LecturaDatosEx e) {
            System.err.println("Error al buscarPeliculas:"+e.getMessage());
        }
    }

    @Override
    public void iniciarArchivo() {
        try {
            if(this.datos.existe(NOMBRE_ARCHIVO)){
                this.datos.eliminar(NOMBRE_ARCHIVO);
                this.datos.crear(NOMBRE_ARCHIVO);
            }else{
                this.datos.crear(NOMBRE_ARCHIVO);
            }
         
        } catch (AccesoDatosEx ex) {
            System.err.println("Error iniciarArchivo:" + ex.getMessage());
        }
    }

}
