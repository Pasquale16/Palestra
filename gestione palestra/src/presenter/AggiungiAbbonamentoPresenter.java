
package presenter;

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

        
        boolean isAbbonamentoAggiunto = addAbbonamento(id, tipoAbbonamento, durata);

        
        if (isAbbonamentoAggiunto) {
            view.showSuccessMessage("Abbonamento aggiunto con successo!");
        } else {
            view.showErrorMessage("Errore nell'aggiungere l'abbonamento.");
        }
    }

    
    private boolean addAbbonamento(String id, String tipoAbbonamento, String durata) {
        
        return true;
    }
}


