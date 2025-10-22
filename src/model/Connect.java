package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    private Connection conn;
    private String dbName;
    private String user;
    private String pass;
    private String url;
    
    public Connect( String dbName, String user, String pass ) {
        
        this.dbName = dbName;
        this.user = user;
        this.pass = pass;
        url = "jdbc:mariadb://localhost:3306/";
    }
    
    public void connecting() {
        
        //jdbc:mariadb://localhost:3306/tanar_company?username=user&password=pass;
        conn = null;
        String user = "?username=" + this.user;
        String pass = "&password=" + this.pass;
        try {
            
           conn = DriverManager.getConnection( url + dbName + user + pass );
           
        } catch ( SQLException ex ) {
            
            System.err.println( "Hiba a kapcsolódás során" );
        }
    }
    
    public Connection getConn() {
        return conn;
    }
}
