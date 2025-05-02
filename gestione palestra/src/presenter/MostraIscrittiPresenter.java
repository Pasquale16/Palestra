package presenter;

import java.util.ArrayList;
import model.GestioneIscritti;
import model.Iscritto;
import view.MostraIscritti;

public class MostraIscrittiPresenter {

    private final MostraIscritti view;

    public MostraIscrittiPresenter(MostraIscritti view) {
        this.view = view;
    }

    public void mostraIscritti() {
        ArrayList<Iscritto> iscritti = GestioneIscritti.getInstance().getLista();

        String iscrittiText = "Elenco Iscritti:\n";
        for (Iscritto iscritto : iscritti) {
            iscrittiText += iscritto.toString() + "\n";
        }

        view.getTextArea().setText(iscrittiText);
    }
}
