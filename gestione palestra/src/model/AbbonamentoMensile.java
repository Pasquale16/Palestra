
package model;
import java.time.LocalDate;

public class AbbonamentoMensile extends Abbonamento {
    
    public AbbonamentoMensile(boolean attivo, String tipo){
       LocalDate inizio = LocalDate.now();
       LocalDate fine = inizio.plusMonths(1);
       super(attivo,tipo,inizio,fine);
    }
    
    
}
