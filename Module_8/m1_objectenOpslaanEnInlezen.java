package Module_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Paths;
import java.time.LocalDate;

class Artikel implements Serializable {
    private static final long serialVersionUID = 1L;

    private LocalDate publicatiedatum;
    private String titel;
    private String auteur;
    private String inhoud;

    // constructor
    public Artikel(LocalDate publicatiedatum, String titel, String auteur, String inhoud) {
        this.publicatiedatum = publicatiedatum;
        this.titel = titel;
        this.auteur = auteur;
        this.inhoud = inhoud;
    }

    // getters
    public String getAuteur() { return auteur; }
    public String getInhoud() { return inhoud; }
    public LocalDate getPublicatiedatum() { return publicatiedatum; }
    public String getTitel() { return titel; }

    // setters
    public void setAuteur(String auteur) { this.auteur = auteur; }
    public void setInhoud(String inhoud) { this.inhoud = inhoud; }
    public void setPublicatiedatum(LocalDate publicatiedatum) { this.publicatiedatum = publicatiedatum; }
    public void setTitel(String titel) { this.titel = titel; }

    @Override
    public String toString() {
        return "Artikel{" +
                "publicatiedatum=" + publicatiedatum +
                ", titel='" + titel + '\'' +
                ", auteur='" + auteur + '\'' +
                ", inhoud='" + inhoud + '\'' +
                '}';
    }
}

public class m1_objectenOpslaanEnInlezen {

    public static void main(String[] args) {
        Artikel artikel = new Artikel(LocalDate.now(), "Mijn Artikel", "Thibo", "Dit is de inhoud van het artikel.");

        // schrijf naar bestand (object stream)
        try (ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream(Paths.get("Module_8", "artikel.txt").toFile())
        )) {
            output.writeObject(artikel);
            System.out.println("Artikel weggeschreven naar artikel.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // lees terug uit bestand
        try (ObjectInputStream input = new ObjectInputStream(
                new FileInputStream(Paths.get("Module_8", "artikel.txt").toFile())
        )) {
            Artikel read = (Artikel) input.readObject();
            System.out.println("Gelezen artikel: " + read);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
