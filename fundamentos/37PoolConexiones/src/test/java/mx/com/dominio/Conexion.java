/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.dominio;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Windows10
 */
public class Conexion {

    public static final String URL = "jdbc:mysql://localhost:3306/db_test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

    public static DataSource getDataSource(){
        BasicDataSource basicDataSource= new BasicDataSource();
        basicDataSource.setUrl(URL);
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("");
        // Inicializar Pool de conexiones
        basicDataSource.setInitialSize(5);
        
        return basicDataSource;
    }
    public static Connection getConnection() throws SQLException {
        Connection connection = getDataSource().getConnection();
        return connection;
    }

    public static void close(PreparedStatement statement) throws SQLException {
        statement.close();
    }
    
    public static void close(ResultSet resultSet) throws SQLException{
        resultSet.close();
    }
    
    public static void close(Connection connection) throws SQLException{
        connection.close();
    }

}
