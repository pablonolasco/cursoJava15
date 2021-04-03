
import mx.com.dominio.ManejoArchivo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OPTIPLEX 9010
 */
public class Test {
    public static void main(String[] args) {
        var archivo="archivo.txt";
        //ManejoArchivo.crearArchivo(archivo);
        //ManejoArchivo.agregarInformacion(archivo, "hola mundo... ");
        //ManejoArchivo.agregarInformacion(archivo, "hello ");
        ManejoArchivo.leerArchivo(archivo);
    }
}
