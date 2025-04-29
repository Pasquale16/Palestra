
package model;
import java.time.LocalDate;

public class AbbonamentoAnnuale extends Abbonamento {
    public AbbonamentoAnnuale(boolean attivo, String tipo){
       LocalDate inizio = LocalDate.now();
       LocalDate fine = inizio.plusYears(1);
       super(attivo,tipo,inizio,fine);
    }
    
}
