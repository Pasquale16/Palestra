
package presenter;

import java.util.Random;
import model.GestioneIscritti;
import model.Iscritto;
import view.AggiungiIscritto;

public class AggiungiIscrittoPresenter {

    private AggiungiIscritto view;

    public AggiungiIscrittoPresenter(AggiungiIscritto view) {
        this.view = view;
    }

    public void onAggiungiButtonClicked() {
        String nome = view.getNome();
        String cognome = view.getCognome();

        if (nome.isEmpty() || cognome.isEmpty()) {
            view.showErrorMessage("Nome e Cognome non possono essere vuoti!");
            return;
        }

        boolean isIscrittoAggiunto = addIscritto(nome, cognome);

        if (isIscrittoAggiunto) {
            view.showSuccessMessage("Iscritto aggiunto con successo!");
        } else {
            view.showErrorMessage("Errore nell'aggiungere l'iscritto.");
        }
    }

    private boolean addIscritto(String nome, String cognome) {
        Random rand = new Random();
        int id = rand.nextInt(10000);
        Iscritto iscritto = new Iscritto(nome, cognome, id);
        GestioneIscritti.getInstance().aggiungiIscritto(iscritto);
        return true;
    }
}