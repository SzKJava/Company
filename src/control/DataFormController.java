
package control;

import java.util.Vector;
import view.MainForm;
import view.workerForm;


public class DataFormController {

    private DatabaseController dbCtrl;
    private workerForm workerFrm;
    private int status;
    private MainForm mainFrm;
    
    
    public DataFormController( DatabaseController dbCtrl, int status, MainForm mainFrm ) {
        
        this.dbCtrl = dbCtrl;
        this.status = status;
        workerFrm = new workerForm(  mainFrm, false );
        initComponents();
    }
    
    private void addEventHolder() {
        
        workerFrm.getExitBtn().addActionListener( event -> exit() );
        workerFrm.getCancelBtn().addActionListener( event -> cancel() );
        workerFrm.getSaveBtn().addActionListener( event ->
        { switch( status ) { case 1 -> saveWorker();  case 2 -> updateWorker(); }});
    }
    
    private void initComponents() {
        
        switch( status ) {
            
            case 1:
                workerFrm.getSaveBtn().setText( "Mentés" );
                workerFrm.setTitle( "Új dolgozó felvétele" );
                workerFrm.setLocationRelativeTo( workerFrm );
                workerFrm.setVisible( true );
                break;
                
            case 2:
                workerFrm.getSaveBtn().setText( "Módosítás" );
                workerFrm.setTitle( "Dolgozó adatainak módosítása" );
                break;
        }
        
        workerFrm.setModal( true );
        workerFrm.setLocationRelativeTo( workerFrm );
        addEventHolder();
    }
    
    private void saveWorker() {
        
        Vector<Object> workers = new Vector<>();
        Object name = workerFrm.getNameTf().getText();
        workers.add( name );
        Object salary = workerFrm.getSalaryTf().getText();
        workers.add( salary );
        Object birth_date = workerFrm.getBornTf().getText();
        workers.add( birth_date );
        Object hire_date = workerFrm.getHireTf().getText();
        workers.add( hire_date );
        Object address = workerFrm.getAddressTf().getText();
        workers.add( address );
        Object city = workerFrm.getCityTf().getText();
        workers.add( city );
        Object role = workerFrm.getRoleTf().getText();
        workers.add( role );
        
        boolean success = dbCtrl.newWorkerData( workers );
        if( success ) {
            
            workerFrm.setStatusLbl( "Sikeres írás" );
            cancel();
            
        }else {
            
            workerFrm.setStatusLbl( "Hiba a  kiírás" );
        }
        
    }
    
    public void setTextFields( Vector<Object> workers ) {
        
        workerFrm.setNameTf( String.valueOf( workers.get( 0 )));
        workerFrm.setsalaryTf(String.valueOf( workers.get( 1 )));
        workerFrm.setBornTf(String.valueOf( workers.get( 2 )));
        workerFrm.setHireTf(String.valueOf( workers.get( 3 )));
        workerFrm.setAddressTf(String.valueOf( workers.get( 4 )));
        workerFrm.setCityTf(String.valueOf( workers.get( 5 )));
        workerFrm.setRoleTf(String.valueOf( workers.get( 6 )));
        workerFrm.setVisible( true );
    }
    
    private void updateWorker( ) {
        
        Vector<Object> workers = new Vector<>();
        Object name = workerFrm.getNameTf().getText();
        workers.add( name );
        Object salary = workerFrm.getSalaryTf().getText();
        workers.add( salary );
        Object birth_date = workerFrm.getBornTf().getText();
        workers.add( birth_date );
        Object hire_date = workerFrm.getHireTf().getText();
        workers.add( hire_date );
        Object address = workerFrm.getAddressTf().getText();
        workers.add( address );
        Object city = workerFrm.getCityTf().getText();
        workers.add( city );
        Object role = workerFrm.getRoleTf().getText();
        workers.add( role );
        
        boolean success = dbCtrl.updateWorkerData( workers );
        if( success ) {
            
            workerFrm.setStatusLbl( "Sikeres írás" );
            cancel();
            
        }else {
            
            workerFrm.setStatusLbl( "Hiba a  kiírás" );
        }
    }
    
    private void cancel() {
        
        workerFrm.setNameTf( " " );
        workerFrm.setsalaryTf( " " );
        workerFrm.setBornTf( " " );
        workerFrm.setHireTf( " " );
        workerFrm.setAddressTf( " " );
        workerFrm.setCityTf( " " );
        workerFrm.setRoleTf( " " );
    }
    
    private void exit() {
        
        workerFrm.dispose();
    }
}
