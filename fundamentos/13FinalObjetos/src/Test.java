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
        final Persona persona= new Persona();
        // No se puede asginar una nueva referencia
        // persona= new Persona();
        
        // Se puede modifcar el valor del contenido
        persona.setNombre("xime");
        System.out.println(persona.getNombre());
        persona.setNombre("pablo");
        System.out.println(persona.getNombre());
    }
}
