package presenter;

import model.Abbonamento;
import model.GestioneIscritti;
import model.Iscritto;
import view.StoricoAbbonamenti;

public class StoricoAbbonamentiPresenter {

    private final StoricoAbbonamenti view;

    public StoricoAbbonamentiPresenter(StoricoAbbonamenti view) {
        this.view = view;
    }

    public void mostraStoricoAbbonamenti() {
        String id = view.getId();

        if (id == null || id.trim().isEmpty()) {
            view.setTextAreaContent("Per favore inserisci un ID valido.");
            return;
        }

        String storico = getStoricoAbbonamenti(Integer.parseInt(id));

        view.setTextAreaContent(storico);
    }

    private String getStoricoAbbonamenti(int id) {
        Iscritto iscritto = GestioneIscritti.getInstance().cerca(id);
        String storico = "";
        for(Abbonamento a : iscritto.getStorico()){
            storico += a.toString() + "\n";
        }
        return storico;
    }
}
