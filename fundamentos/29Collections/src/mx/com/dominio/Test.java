/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.dominio;

import java.util.*;

/**
 *
 * @author OPTIPLEX 9010
 */
public class Test {
    public static void main(String[] args) {
        List lista= new ArrayList();
        // acepta duplicado y maneja un orden
        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");
        
        imprimir(lista);
        System.out.println("");
        // Lambadas
        
        /*lista.forEach(element->{
            System.out.println("elemento:"+element);
        });
        */
        // no acepta duplicado y no guardar orden 
        Set set= new HashSet();
        set.add("b");
        set.add("c");
        set.add("s");
        set.add("b");
        
        imprimir(set);
        
        Map mapa= new HashMap();
        mapa.put("valor1","1");
        mapa.put("valor2", 2);
        mapa.put("valor3", 3);
        
        String elemento=(String)mapa.get("valor1");
        
        System.out.println("mapa:"+elemento);
        System.out.println("");
        // llaves
        imprimir(mapa.keySet());
        // valores
        imprimir(mapa.values());
    }
    
    public static void imprimir(Collection collection){
        collection.forEach(element->{
            System.out.println("elemento:"+element);
        });
    }
}
