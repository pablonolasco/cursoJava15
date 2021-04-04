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
import mx.com.model.Persona;

/**
 *
 * @author Windows10
 */
public class PersonaDAO {

    public static final String SQL_CREATE_PERSON = "insert into persona (nombre, apellido, email, telefono) values (?,?,?,?)";
    public static final String SQL_READ_PERSON = "select id, nombre, apellido, email, telefono from persona";
    public static final String SQL_UPDATE_PERSON = "update persona set nombre=?, apellido=?, email=?, telefono=? where id=?";
    public static final String SQL_DELETE_PERSON = "delete from persona where id=?";

    public Connection connectionTransaction = null;
    private PreparedStatement statement = null;
    private ResultSet resultSet = null;

    public PersonaDAO() {
    }

    public PersonaDAO(Connection connectionTransaction) {
        this.connectionTransaction = connectionTransaction;
    }

    public int insertarPersona(Persona persona) throws SQLException{
        int inserted = 0;

        try {
            this.connectionTransaction = (this.connectionTransaction != null) ? this.connectionTransaction : getConnection();
            this.statement = connectionTransaction.prepareStatement(PersonaDAO.SQL_CREATE_PERSON);
            this.statement.setString(1, persona.getNombre());
            this.statement.setString(2, persona.getApellido());
            this.statement.setString(3, persona.getEmail());
            this.statement.setInt(4, persona.getTelefono());
            inserted = this.statement.executeUpdate();

        } finally {

            try {
                close(statement);
                if (this.connectionTransaction == null) {
                     close(connectionTransaction);
                }
               
            } catch (SQLException ex) {
                Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return inserted;
    }

    public List<Persona> obtenerLista() throws SQLException{

        List<Persona> listaPersona = new ArrayList<>();
        try {
            this.connectionTransaction = (this.connectionTransaction != null) ? this.connectionTransaction : getConnection();
            statement = connectionTransaction.prepareStatement(SQL_READ_PERSON);
            resultSet = statement.executeQuery();
            // leer registros
            while (resultSet.next()) {
                //       System.out.println("id:" + resultSet.getInt("id") + ", nombre:" + resultSet.getString("nombre"));
                listaPersona.add(new Persona(resultSet.getInt("id"), resultSet.getString("nombre"),
                        resultSet.getString("apellido"), resultSet.getString("email"),
                        resultSet.getInt("telefono")));
            }

        } finally {
            try {
                close(resultSet);
                close(statement);
                 if (this.connectionTransaction == null) {
                    close(connectionTransaction);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return listaPersona;
    }

    public int actualizarPersona(Persona persona) throws SQLException{
        int upadte = 0;
        try {
            this.connectionTransaction = (this.connectionTransaction != null) ? this.connectionTransaction : getConnection();
            this.statement = this.connectionTransaction.prepareStatement(PersonaDAO.SQL_UPDATE_PERSON);
            this.statement.setString(1, persona.getNombre());
            this.statement.setString(2, persona.getApellido());
            this.statement.setString(3, persona.getEmail());
            this.statement.setInt(4, persona.getTelefono());
            this.statement.setInt(5, persona.getId());
            upadte = this.statement.executeUpdate();

        } finally {
            try {
                close(statement);
                if (this.connectionTransaction == null) {
                    close(connectionTransaction);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return upadte;
    }

    public int eliminarPersona(Persona persona) throws SQLException{
        int deleted = 0;
        try {
            this.connectionTransaction = (this.connectionTransaction != null) ? this.connectionTransaction : getConnection();
            this.statement = connectionTransaction.prepareStatement(PersonaDAO.SQL_DELETE_PERSON);
            this.statement.setInt(1, persona.getId());
            deleted = this.statement.executeUpdate();
        }  finally {
            try {
                close(this.statement);
                 if (this.connectionTransaction == null) {
                    close(connectionTransaction);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return deleted;
    }

}
