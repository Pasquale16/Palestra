
package presenter;

import model.AbbonamentoAnnuale;
import model.AbbonamentoMensile;
import model.GestioneIscritti;
import model.Iscritto;
import view.AggiungiAbbonamento;


public class AggiungiAbbonamentoPresenter {

    private AggiungiAbbonamento view;

    public AggiungiAbbonamentoPresenter(AggiungiAbbonamento view) {
        this.view = view;
    }

    
    public void onAggiungiButtonClicked() {
        String id = view.getID();
        String tipoAbbonamento = view.getTipoAbbonamento();
        String durata = view.getDurata();

        
        if (id.isEmpty() || tipoAbbonamento.isEmpty() || durata.isEmpty()) {
            view.showErrorMessage("Tutti i campi devono essere compilati!");
            return;
        }

        
        boolean isAbbonamentoAggiunto = addAbbonamento(Integer.parseInt(id), tipoAbbonamento, durata);

        
        if (isAbbonamentoAggiunto) {
            view.showSuccessMessage("Abbonamento aggiunto con successo!");
        } else {
            view.showErrorMessage("Errore nell'aggiungere l'abbonamento.");
        }
    }

    
    private boolean addAbbonamento(int id, String tipoAbbonamento, String durata) {
        Iscritto iscritto = GestioneIscritti.getInstance().cerca(id);
        if(durata.equals("mensile")){
            AbbonamentoMensile abbonamento = new AbbonamentoMensile(true, tipoAbbonamento);
            iscritto.aggiungiAbbonamento(abbonamento);
            return true;
        }
        else if(durata.equals("annuale")){
            AbbonamentoAnnuale abbonamento = new AbbonamentoAnnuale(true, tipoAbbonamento);
            iscritto.aggiungiAbbonamento(abbonamento);
            return true;
        }
        else{
            return false;
        }
    }
}


