package com.revature.data;

//import from java.sql
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

//this class creates and returns a connection to out database
//we are using a factory design pattern as well as a singleton design pattern to return a single instance
//of the same connection
public class ConnectionFactory {
    //singleton value, only one connection exists
    //we use static keyword to ensure our connection only exists once
    //because a static variable is attached to the Class, it won't make a new connection every time
    //we make a new instance of the ConnectionFactory class
    private static Connection connection = null;

    //to limit access to this class we can create a private constructor so java doesn't make a public default one
    private ConnectionFactory() {

    }

    //this is only method we have access to and it handles connection creation
    public static Connection getConnection() {
        //check if the connection has been created
        if(connection == null) {
            System.out.println("Connection is being created...");
            //if this triggers then we know the connection hasn't been created yet
            //because it has null value
            //here we write the logic of creating the connection

            ResourceBundle bundle = ResourceBundle.getBundle("DbConfig");

            String url = bundle.getString("url");
            String username = bundle.getString("username");
            String password = bundle.getString("password");
            try {
                //pass in credentials
                connection = DriverManager.getConnection(url, username, password);
            } catch(SQLException e) {
                //if something wrong with connection then print below message
                System.out.println("Something went wrong...");
                e.printStackTrace();
            }
        }
        return connection;
    }

}
