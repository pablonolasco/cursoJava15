/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author OPTIPLEX 9010
 */
public class Test {
    public static void main(String[] args) {
        List<String> lista= new ArrayList<>();
        lista.add("hola");
        lista.add("mundo");
        
        String nombre= lista.get(0);
        System.out.println("nombre:"+nombre);
        System.out.println("");
        imprimir(lista);
        System.out.println("");
        Set<String> listaSet=new HashSet<>();
        listaSet.add("ok");
        listaSet.add("pepsi");
        imprimir(listaSet);
        
        System.out.println("");
        
        //Map<String,Integer> mapa1= new HashMap<>();
        Map<String,String> mapa1= new HashMap<>();
        mapa1.put("valor1", "ximena");
        mapa1.put("valor2", "vianca");
        mapa1.put("valor1", "ol");
        
        System.out.println(mapa1.keySet());
        System.out.println(mapa1.values());
    }
    
    public static void imprimir(Collection<String> collection){
        collection.forEach(element->{
            System.out.println(element.concat(" :)"));
        });
    }
}
