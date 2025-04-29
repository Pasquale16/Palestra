
package presenter;

import view.AggiungiIscritto;

public class AggiungiIscrittoPresenter {

    private AggiungiIscritto view;

    public AggiungiIscrittoPresenter(AggiungiIscritto view) {
        this.view = view;
    }

    // Metodo che viene chiamato quando l'utente preme il pulsante "Aggiungi"
    public void onAggiungiButtonClicked() {
        String nome = view.getNome();
        String cognome = view.getCognome();

        // Validazione dei dati
        if (nome.isEmpty() || cognome.isEmpty()) {
            view.showErrorMessage("Nome e Cognome non possono essere vuoti!");
            return;
        }

        // Simulazione dell'aggiunta dell'iscritto
        boolean isIscrittoAggiunto = addIscritto(nome, cognome);

        // Aggiorna la vista in base al risultato
        if (isIscrittoAggiunto) {
            view.showSuccessMessage("Iscritto aggiunto con successo!");
        } else {
            view.showErrorMessage("Errore nell'aggiungere l'iscritto.");
        }
    }

    // Simula l'aggiunta dell'iscritto (potrebbe essere un salvataggio su database, ecc.)
    private boolean addIscritto(String nome, String cognome) {
        // In un'applicazione reale, qui si troverebbe la logica per aggiungere l'iscritto a un database
        // Per ora, simuliamo sempre un successo
        return true;
    }
}