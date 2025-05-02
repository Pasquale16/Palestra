
package model;

import java.util.ArrayList;

public class Iscritto {
    private String nome;
    private String cognome;
    private int id;

    public ArrayList<Abbonamento> getAbbonamentiattivi() {
        return abbonamentiattivi;
    }

    public ArrayList<Abbonamento> getStorico() {
        return storico;
    }
    private ArrayList<Abbonamento> abbonamentiattivi;
    private ArrayList<Abbonamento> storico;
    
    public Iscritto(String nome, String cognome, int id){
        this.nome=nome;
        this.cognome=cognome;
        this.id=id;
        this.abbonamentiattivi = new ArrayList<>();
        this.storico = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome + " Cognome: " + cognome + " ID: " + id + "\n";
    }
    
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getId() {
        return id;
    }
    
    public void aggiungiAbbonamento(Abbonamento abbonamento){
        this.abbonamentiattivi.add(abbonamento);
        CsvManager.getInstance().salvaAbbonamenti();
    }
    
    public boolean terminaAbbonamento(String tipo){
        for(Abbonamento abbonamento : abbonamentiattivi){
            if(abbonamento.getTipo().equals(tipo)){
                abbonamentiattivi.remove(abbonamento);
                storico.add(abbonamento);
                abbonamento.setAttivo(false);
                CsvManager.getInstance().salvaAbbonamenti();
                return true;
            }
        }
        return false;
    }
}
