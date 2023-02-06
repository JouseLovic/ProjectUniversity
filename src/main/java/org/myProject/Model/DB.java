package org.myProject.Model;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

    private String uri = "jdbc:mysql://localhost:3306/University";
    private String user = "root";
    private String pass = "inari-sama100";

    private Connection conexion;
    private static Connection instance;

    private DB(){
        try {
            conexion = DriverManager.getConnection(uri, user, pass);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "La aplicación no ha recibido ningun paquete de la base de datos. \nPor favor, asegurese de que encendió el servidor Apache y MySQL");
            System.exit(0);
        }
    }

    public synchronized static Connection getInstance(){
        if(instance == null){
            instance = (Connection) new DB();
        }
        return instance;
    }

    public synchronized  Connection getConnectionS(){//this is for the statement
        return conexion;
    }

    public synchronized void closeConnection(){
        instance = null;
    }

}

