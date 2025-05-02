package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class CsvManager {
    private static CsvManager instance;
    
    public static CsvManager getInstance(){
        if(instance == null){
            instance = new CsvManager();
        }
        return instance;
    }
    
    public void salvaIscritti(ArrayList<Iscritto> lista){
        try (PrintWriter writer = new PrintWriter(new FileWriter("iscritti.csv"))) {
            for (Iscritto i : lista) {
                writer.println(i.getNome() + "," + i.getCognome() + "," + i.getId());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Iscritto> caricaIscritti() {
        ArrayList<Iscritto> lista = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("iscritti.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] campi = line.split(",");
                if (campi.length >= 3) {
                    lista.add(new Iscritto(campi[0], campi[1], Integer.parseInt(campi[2])));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public void caricaAbbonamenti(){
        try (BufferedReader reader = new BufferedReader(new FileReader("abbonamenti.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] campi = line.split(",");
                if (campi.length >= 4) {
                    Iscritto iscritto = GestioneIscritti.getInstance().cerca(Integer.parseInt(campi[0]));
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate inizio = LocalDate.parse(campi[2], formatter);
                    LocalDate fine = LocalDate.parse(campi[3], formatter);
                    Abbonamento abbonamento = new Abbonamento(true, campi[1], inizio, fine);
                    iscritto.aggiungiAbbonamento(abbonamento);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void salvaAbbonamenti(){
        try (PrintWriter writer = new PrintWriter(new FileWriter("abbonamenti.csv"))) {
            for(Iscritto i : GestioneIscritti.getInstance().getLista()){
                for(Abbonamento a : i.getAbbonamentiattivi()){
                    writer.println(i.getId() + "," + a.toString());
                }
                for(Abbonamento a : i.getStorico()){
                    writer.println(i.getId() + "," + a.toString());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
