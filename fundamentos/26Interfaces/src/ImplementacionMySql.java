/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows10
 */
public class ImplementacionMySql implements IADatos{

    @Override
    public void inserta() {
        System.out.println("insertar desde MySql");
    }

    @Override
    public void listar() {
        System.out.println("listar desde MySql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MySql");
    }
    
}
