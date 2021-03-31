/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.dominio;

/**
 *
 * @author Windows10
 */
public class Gerente extends Empleado{
    private String departamento;
    
    public Gerente(String nombre,int sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento= departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public String detalleEmpleado(){
        return super.detalleEmpleado()+" departamento:"+this.departamento;
    }
    
    
}
