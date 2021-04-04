/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.dao;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static mx.com.dominio.Conexion.*;
import mx.com.model.PersonaDTO;

/**
 *
 * @author Windows10
 */
public class PersonaDAOJDBC implements IPersonaDAO{

    public static final String SQL_CREATE_PERSON = "insert into persona (nombre, apellido, email, telefono) values (?,?,?,?)";
    public static final String SQL_READ_PERSON = "select id, nombre, apellido, email, telefono from persona";
    public static final String SQL_UPDATE_PERSON = "update persona set nombre=?, apellido=?, email=?, telefono=? where id=?";
    public static final String SQL_DELETE_PERSON = "delete from persona where id=?";

    private Connection connection = null;
    private PreparedStatement statement = null;
    private ResultSet resultSet = null;

    
    @Override
    public int insertarPersona(PersonaDTO persona) {
        int inserted = 0;

        try {
            this.connection = getConnection();
            this.statement = connection.prepareStatement(PersonaDAOJDBC.SQL_CREATE_PERSON);
            this.statement.setString(1, persona.getNombre());
            this.statement.setString(2, persona.getApellido());
            this.statement.setString(3, persona.getEmail());
            this.statement.setInt(4, persona.getTelefono());
            inserted = this.statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
            try {
                this.connection.rollback();
            } catch (SQLException ex) {
                e.printStackTrace(System.out);
            }
        } finally {

            try {
                close(statement);
                close(connection);
            } catch (SQLException ex) {
                Logger.getLogger(PersonaDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return inserted;
    }

    @Override
    public List<PersonaDTO> obtenerLista() {

        List<PersonaDTO> listaPersona = new ArrayList<>();
        try {
            connection = getConnection();
            statement = connection.prepareStatement(SQL_READ_PERSON);
            resultSet = statement.executeQuery();
            // leer registros
            while (resultSet.next()) {
                //       System.out.println("id:" + resultSet.getInt("id") + ", nombre:" + resultSet.getString("nombre"));
                listaPersona.add(new PersonaDTO(resultSet.getInt("id"), resultSet.getString("nombre"),
                        resultSet.getString("apellido"), resultSet.getString("email"),
                        resultSet.getInt("telefono")));
            }

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                close(resultSet);
                close(statement);
                close(connection);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return listaPersona;
    }

    @Override
    public int actualizarPersona(PersonaDTO persona) {
        int upadte = 0;
        try {
            this.connection = getConnection();
            this.statement = this.connection.prepareStatement(PersonaDAOJDBC.SQL_UPDATE_PERSON);
            this.statement.setString(1, persona.getNombre());
            this.statement.setString(2, persona.getApellido());
            this.statement.setString(3, persona.getEmail());
            this.statement.setInt(4, persona.getTelefono());
            this.statement.setInt(5, persona.getId());
            upadte = this.statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                close(statement);
                close(connection);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return upadte;
    }
    
    @Override
    public int eliminarPersona(PersonaDTO persona){
        int deleted=0;
        try {
            this.connection=getConnection();
            this.statement=connection.prepareStatement(PersonaDAOJDBC.SQL_DELETE_PERSON);
            this.statement.setInt(1, persona.getId());
            deleted=this.statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }finally{
            try {
                close(this.statement);
                close(this.connection);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return deleted;
    }

}
