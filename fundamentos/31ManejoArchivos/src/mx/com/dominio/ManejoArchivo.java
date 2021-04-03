/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.dominio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author OPTIPLEX 9010
 */
public class ManejoArchivo {
    public static void crearArchivo(String name) {
        File archivo= new File(name);
        try {
            PrintWriter salida= new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        }catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
    public static void escribirArchivo(String path, String content){
        try {
            PrintWriter salida= new PrintWriter(path);
            salida.write(content);
            salida.close();
            System.out.println("Se escribio el mensaje");
        }catch(FileNotFoundException fe){
            fe.printStackTrace(System.out);
        }catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
    public static void agregarInformacion(String path, String content){
        try {
            PrintWriter salida= new PrintWriter(new FileWriter(path,true));
            salida.println(content);
            salida.close();
            System.out.println("se escribio mensaje");
        }catch(FileNotFoundException fe){
            fe.printStackTrace(System.out);
        }catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
    public static void leerArchivo(String path){
        File file= new File(path);
        try {
            BufferedReader reader= new BufferedReader(new FileReader(file));
            // Solo lee una linea por eso se debe agregar un while
            var result=reader.readLine();
            // Mientras que leer
            while (result != null) {                
                System.out.println(result);
                result= reader.readLine();
            }
        }catch(FileNotFoundException fe){
            fe.printStackTrace(System.out);
        }catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
