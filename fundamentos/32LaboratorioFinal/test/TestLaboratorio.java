
import java.util.Scanner;
import mx.com.negocio.CatalogoPeliculaImpl;
import mx.com.negocio.ICatalogoPelicula;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author OPTIPLEX 9010
 */
public class TestLaboratorio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        var opcion = 0;
        ICatalogoPelicula pelicula = new CatalogoPeliculaImpl();
        String nombreArchivo="";
        do {
            System.out.println("Menu:");
            System.out.println("1-. Iniciar catalogo de peliculas:");
            System.out.println("2-. Agregar pelicula:");
            System.out.println("3-. Listar peliculas:");
            System.out.println("4-. Buscar pelicula:");
            System.out.println("0-. Salir:");
            System.out.println("Elige opcion:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa nombre del catalogo");
                    nombreArchivo=leer.next();
                    pelicula.iniciarArchivo(nombreArchivo);
                    break;
                case 2:
                    System.out.println("Ingresa nombre de la pelicula:");
                    pelicula.agregarPelicula(leer.next(), nombreArchivo);
                    break;
                case 3:
                    pelicula.listarPeliculas(nombreArchivo);
                    break;
                case 4:
                    System.out.println("Ingresa nombre de la pelicula:");
                    pelicula.buscarPeliculas(nombreArchivo, leer.next());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Elige una opcion valida");
                    break;

            }
        } while (opcion >= 0 && opcion <= 4);
    }
}
