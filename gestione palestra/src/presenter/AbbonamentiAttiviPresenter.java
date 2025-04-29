
package presenter;

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

        
        String abbonamenti = getAbbonamentiAttivi(id);

        
        view.setAbbonamentiText(abbonamenti);
    }

    
    private String getAbbonamentiAttivi(String id) {
        
        if ("123".equals(id)) {
            return "Abbonamento 1: Tipo A, Durata 12 mesi\nAbbonamento 2: Tipo B, Durata 6 mesi";
        } else {
            return "Nessun abbonamento trovato per l'ID: " + id;
        }
    }
}

    

