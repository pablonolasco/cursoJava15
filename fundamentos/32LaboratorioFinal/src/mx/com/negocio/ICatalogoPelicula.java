/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.negocio;

/**
 *
 * @author OPTIPLEX 9010
 */
public interface ICatalogoPelicula {
    void agregarPelicula(String nombre,String nombreArchivo);
    void listarPeliculas(String nombreArchivo);
    void buscarPeliculas(String nombreArchivo,String buscar);
    void iniciarArchivo(String archivo);
    
}
