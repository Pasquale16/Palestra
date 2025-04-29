
package presenter;

import view.AbbonamentiAttivi;


public class AbbonamentiAttiviPresenter  {


    private AbbonamentiAttivi view;

    public AbbonamentiAttiviPresenter(AbbonamentiAttivi view) {
        this.view = view;
    }

    // Metodo chiamato quando l'utente preme il pulsante "Mostra"
    public void onMostraButtonClicked() {
        String id = view.getID();

        // Validazione dell'ID
        if (id.isEmpty()) {
            view.showErrorMessage("ID non può essere vuoto.");
            return;
        }

        // Simula il recupero degli abbonamenti attivi
        String abbonamenti = getAbbonamentiAttivi(id);

        // Aggiorna la vista con i risultati
        view.setAbbonamentiText(abbonamenti);
    }

    // Simulazione di un recupero degli abbonamenti attivi (ad esempio da un database)
    private String getAbbonamentiAttivi(String id) {
        // In un'applicazione reale, qui interagiremmo con il modello o il database
        // Per ora, simuliamo il recupero di dati

        // Simuliamo che l'ID sia corretto e ritorni degli abbonamenti
        if ("123".equals(id)) {
            return "Abbonamento 1: Tipo A, Durata 12 mesi\nAbbonamento 2: Tipo B, Durata 6 mesi";
        } else {
            return "Nessun abbonamento trovato per l'ID: " + id;
        }
    }
}

    

