
package presenter;

import view.AggiungiAbbonamento;


public class AggiungiAbbonamentoPresenter {

    private AggiungiAbbonamento view;

    public AggiungiAbbonamentoPresenter(AggiungiAbbonamento view) {
        this.view = view;
    }

    // Metodo che viene chiamato quando l'utente preme il pulsante "Aggiungi"
    public void onAggiungiButtonClicked() {
        String id = view.getID();
        String tipoAbbonamento = view.getTipoAbbonamento();
        String durata = view.getDurata();

        // Validazione dei dati
        if (id.isEmpty() || tipoAbbonamento.isEmpty() || durata.isEmpty()) {
            view.showErrorMessage("Tutti i campi devono essere compilati!");
            return;
        }

        // Simulazione dell'aggiunta dell'abbonamento
        boolean isAbbonamentoAggiunto = addAbbonamento(id, tipoAbbonamento, durata);

        // Aggiorna la vista in base al risultato
        if (isAbbonamentoAggiunto) {
            view.showSuccessMessage("Abbonamento aggiunto con successo!");
        } else {
            view.showErrorMessage("Errore nell'aggiungere l'abbonamento.");
        }
    }

    // Simula l'aggiunta dell'abbonamento (potrebbe essere un salvataggio su database, ecc.)
    private boolean addAbbonamento(String id, String tipoAbbonamento, String durata) {
        // In un'applicazione reale, qui si troverebbe la logica per aggiungere l'abbonamento a un database
        // Per ora, simuliamo sempre un successo
        return true;
    }
}


