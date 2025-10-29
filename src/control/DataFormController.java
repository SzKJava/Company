
package control;

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
        { switch( status ) { case 1 -> saveWorker(); case 2 -> updateWorker(); }});
    }
    
    private void initComponents() {
        
        switch( status ){
            
            case 1:
                workerFrm.getSaveBtn().setText( "Mentés" );
                workerFrm.setTitle( "Új dolgozó felvétele" );
                
            case 2:
                workerFrm.getSaveBtn().setText( "Módosítás" );
                workerFrm.setTitle( "Dolgozó adatainak módosítása" );
        }
        
        workerFrm.setModal( true );
        workerFrm.setLocationRelativeTo( workerFrm );
    }
    
    private void saveWorker() {
        
    }
    
    private void updateWorker() {
        
    }
    
    private void cancel() {
        
    }
    
    private void exit() {
        
    }
}
