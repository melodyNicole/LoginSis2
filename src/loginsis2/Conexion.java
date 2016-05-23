/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginsis2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rocio Ramirez
 */
public class Conexion {
    
    private static String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    private static String JDBC_URL = "jdbc:derby:loginDB;create=true";
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName(DRIVER);
        Connection connection = DriverManager.getConnection(JDBC_URL);
        return connection;
    }
}
