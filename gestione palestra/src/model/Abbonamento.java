
package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Abbonamento {
    
    private boolean attivo;

    public String getTipo() {
        return tipo;
    }
    private String tipo;
    private LocalDate inizio;
    private LocalDate fine;
    
    public Abbonamento(boolean attivo, String tipo, LocalDate inizio, LocalDate fine){
        
        this.attivo=attivo;
        this.tipo=tipo;
        this.inizio=inizio;
        this.fine=fine;
        
        
        
    }
    
    public long getGiorni(){
     
        long giorni = ChronoUnit.DAYS.between(fine,inizio);
        return giorni;
        
    }
    
    public boolean isAttivo(){
        if(getGiorni() <= 0 ) return false;
        return true;
                
    }
    
    public void setAttivo(boolean attivo){
    this.attivo=attivo;
    }
    
    @Override
    public String toString(){
        return tipo + " " + inizio.toString() + " " + fine.toString();
    }
}

    

