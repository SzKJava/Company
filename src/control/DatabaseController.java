package control;

import model.Connect;
import java.sql.Connection;
import java.util.Vector;
import model.SqlRunner;

public class DatabaseController {

    private Connection conn;
    
    public DatabaseController() {
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
}
