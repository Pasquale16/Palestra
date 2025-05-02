package presenter;

import model.GestioneIscritti;
import model.Iscritto;
import view.CercaIscritto;

public class CercaIscrittoPresenter {

    private CercaIscritto view;

    public CercaIscrittoPresenter(CercaIscritto view) {
        this.view = view;
    }

    public void cercaIscritto() {
        String id = view.getIdText();

        if (id == null || id.trim().isEmpty()) {
            view.showMessage("Inserisci un ID valido.");
            return;
        }

        Iscritto iscritto = GestioneIscritti.getInstance().cerca(Integer.parseInt(id));
        
        if (iscritto != null){
            view.showMessage(iscritto.toString());
        } else {
            view.showMessage("Nessun iscritto trovato con ID: " + id);
        }
    }
}
