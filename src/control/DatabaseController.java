package control;

import model.Connect;
import java.sql.Connection;
import java.util.Vector;
import model.SqlRunner;

public class DatabaseController {

    private Connection conn;
    
    public DatabaseController() {
    }
    
    public boolean checkDatabase() {
        
        Connect connect = new Connect( "tanar_company", "tanar", "123" );
        connect.connecting();
        conn = connect.getConn();
        
        if( conn != null ){
            
            return true;
            
        }else {
            
            return false;
        }
     }
    
    protected boolean createDatabase() {
        
        Connect connect = new Connect( "tanar_company", "tanar", "123" );
        conn = connect.baseConnect();
        
        SqlRunner sqlRun = new SqlRunner( "__CREATEDATABASE__" );
        boolean success = sqlRun.createDatabase( conn );
        if( success ) {
            
            return true;
            
        }else {
            
            return false;
        }
        
    }
    
    protected boolean connect() {
        
        Connect connect = new Connect( "tanar_company", "tanar", "123" );
        connect.connecting();
        conn = connect.getConn();
        if( conn != null ) {
            return true;
        }else {
            return false;
        }
    }
    
    protected Vector<Vector<Object>> getWorkerData() {
    
        Vector<Vector<Object>> items = new Vector<>();
        SqlRunner sqlRun = new SqlRunner( "__GETWORKERS__" );
        
        items = sqlRun.getWorkersData( conn );
        
        return items;
    }
    
    protected boolean newWorkerData( Vector<Object> workerData ) {
        
        boolean success = false;
        
        if( conn != null ) {
            
            SqlRunner sqlRun = new SqlRunner( "__SAVEWORKER__" );
            success = sqlRun.setWorkerData( conn, workerData );
            
        }else {
            
            
        }
        
         return success;  
    }
    
    public boolean updateWorkerData( Vector<Object> workers ) {
        
        boolean success = false;
        
        if( conn != null ) {
            
            SqlRunner sqlRun = new SqlRunner( "__UPDATEWORKER__" );
            success = sqlRun.setWorkerData( conn, workers );
            
        }else {
            
            
        }
        
         return success; 
    }
}
