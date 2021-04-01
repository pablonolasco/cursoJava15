/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows10
 */
public interface IADatos {
    // Las interfaces se basan a los comportamientos y 
    // las clases abstractas son enfocadas a las caracteristicas y jerarquia de clases
    int MAX_REGISTROS=10;
    
    void inserta();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
