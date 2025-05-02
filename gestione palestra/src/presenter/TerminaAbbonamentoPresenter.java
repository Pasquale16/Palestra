package presenter;

import model.GestioneIscritti;
import model.Iscritto;
import view.TerminaAbbonamento;

public class TerminaAbbonamentoPresenter {

    private final TerminaAbbonamento view;

    public TerminaAbbonamentoPresenter(TerminaAbbonamento view) {
        this.view = view;
    }

    public void terminaAbbonamento() {
        String id = view.getId();
        String tipoAbbonamento = view.getTipoAbbonamento();

        if (id == null || id.trim().isEmpty() || tipoAbbonamento == null || tipoAbbonamento.trim().isEmpty()) {
            view.setMessage("Per favore inserisci un ID e un tipo di abbonamento validi.");
            return;
        }

        String risultato = terminaAbbonamentoLogica(Integer.parseInt(id), tipoAbbonamento);

        view.setMessage(risultato);
    }
    
    private String terminaAbbonamentoLogica(int id, String tipoAbbonamento) {
        Iscritto iscritto = GestioneIscritti.getInstance().cerca(id);
        if(iscritto.terminaAbbonamento(tipoAbbonamento) == true){
            return "Abbonamento terminato con successo";
        }
        else{
            return "Impossibile terminare";
        }
    }
}
