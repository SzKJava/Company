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
        boolean success = dbCtrl.checkDatabase();
        if( success ) {
           
            System.out.println( "Ok" );
            //frmCtrl.setStatusLbl( "Kapcsolat rendben." );
            
        }else {
            
            boolean dbSuccess = dbCtrl.createDatabase();
            if( dbSuccess ) {
                
                //frmCtrl = new FormController( dbCtrl );
                //frmCtrl.setStatusLbl( "Adatbázis létrehozva" );
            
            }else {
                
                frmCtrl.setStatusLbl( "Adatbázist nem sikerült létrehozni" );
            }
            //System.out.println( "Nincs kapcsolat!" );
            //frmCtrl.setStatusLbl( "Nincs kapcsolat!" );
        }
    }
}
