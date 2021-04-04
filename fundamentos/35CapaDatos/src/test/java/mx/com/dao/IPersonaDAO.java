/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.dao;

import java.sql.SQLException;
import java.util.List;
import mx.com.model.PersonaDTO;

/**
 *
 * @author Windows10
 */
public interface IPersonaDAO {

    int insertarPersona(PersonaDTO persona) throws SQLException;

    List<PersonaDTO> obtenerLista() throws SQLException;

    int actualizarPersona(PersonaDTO persona) throws SQLException;

    int eliminarPersona(PersonaDTO persona) throws SQLException;
}
