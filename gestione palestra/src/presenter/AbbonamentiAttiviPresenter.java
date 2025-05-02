
package presenter;

import model.Abbonamento;
import model.Iscritto;
import model.GestioneIscritti;
import view.AbbonamentiAttivi;


public class AbbonamentiAttiviPresenter  {


    private AbbonamentiAttivi view;

    public AbbonamentiAttiviPresenter(AbbonamentiAttivi view) {
        this.view = view;
    }

    
    public void onMostraButtonClicked() {
        String id = view.getID();

        
        if (id.isEmpty()) {
            view.showErrorMessage("ID non può essere vuoto.");
            return;
        }

        
        String abbonamenti = getAbbonamentiAttivi(Integer.parseInt(id));

        
        view.setAbbonamentiText(abbonamenti);
    }

    
    private String getAbbonamentiAttivi(int id) {
        Iscritto iscritto = GestioneIscritti.getInstance().cerca(id);
        String abbonamenti_attivi = "";
        for(Abbonamento a : iscritto.getAbbonamentiattivi()){
            abbonamenti_attivi += a.toString() + "\n";
        }
        return abbonamenti_attivi;
    }
}

    

