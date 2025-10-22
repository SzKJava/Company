package control;

public class MainController {

     private DatabaseController dbCtrl;
     private FormController frmCtrl;
    
    public MainController() {
        
        start();
        checkDatabase();
    }
    
    private void start() {
        
        dbCtrl = new DatabaseController();
        checkDatabase();
        frmCtrl = new FormController( dbCtrl );
        
    }
    
    private void checkDatabase() {
        
        dbCtrl = new DatabaseController();
        boolean success = dbCtrl.connect();
        if( success ) {
            System.out.println( "Kapcsolat OK");
            
        }else {
            
            System.err.println( "Nincs kapcsolat" );
        }
    }
}
