
package model;
import java.util.ArrayList;


public class GestioneIscritti {
    private ArrayList<Iscritto> lista;
    
    private static GestioneIscritti instance;
    
    public static GestioneIscritti getInstance(){
        if(instance==null){
            instance = new GestioneIscritti();
        }
        return instance;
    }
    
    private GestioneIscritti(){
        lista = CsvManager.getInstance().caricaIscritti();
        CsvManager.getInstance().caricaAbbonamenti();
    }
    
    public void aggiungiIscritto(Iscritto iscritto){
        lista.add(iscritto);
        CsvManager.getInstance().salvaIscritti(lista);
    }
    
    public Iscritto cerca(int id){
        for(Iscritto iscritto : lista){
            if(iscritto.getId() == id){
                return iscritto;
            }
        }
        return null;
    }
    
    public ArrayList<Iscritto> getLista(){
        return lista;
    }
}
