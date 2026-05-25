package Herhalingsoefeningen.Module_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

public class Artikel implements Serializable {
    //fields
    private LocalDate publicatiedatum;
    private String titel, auteur, inhoud;
    //constructors
    public Artikel(String titel, String auteur, String inhoud) {
        this.publicatiedatum = LocalDate.now();
        this.titel = titel;
        this.auteur = auteur;
        this.inhoud = inhoud;
    }

    //getters
    public String getAuteur() {
        return auteur;
    }
    public String getInhoud() {
        return inhoud;
    }
    public LocalDate getPublicatiedatum() {
        return publicatiedatum;
    }
    public String getTitel() {
        return titel;
    }
    //setters
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public void setInhoud(String inhoud) {
        this.inhoud = inhoud;
    }
    public void setPublicatiedatum(LocalDate publicatiedatum) {
        this.publicatiedatum = publicatiedatum;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
    //extra methods
    @Override
    public String toString() {
        return this.auteur + " | " + this.titel + " | " + this.publicatiedatum;
    }

    public static void main(String[] args) {
        Artikel artikel = new Artikel("titel","John Pork","Sit exercitation dolore aliquip laborum ad quis incididunt dolore culpa enim. Reprehenderit ullamco quis ullamco deserunt ea anim sunt ut nisi cupidatat. Esse eiusmod do aliquip id quis anim. Pariatur cupidatat aute exercitation dolore exercitation consequat qui. Occaecat aliqua nostrud nostrud cillum magna amet eu incididunt fugiat ex non minim. Irure id velit sunt id anim anim dolore amet ex Lorem laboris amet anim id. Lorem ipsum sunt sit laboris veniam ea Lorem.");
        
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("./Herhalingsoefeningen/Module_8/artikel.data"))) {
                output.writeObject(artikel);
            }
        catch (Exception e) {
            // TODO: handle exception
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("./Herhalingsoefeningen/Module_8/artikel.data"))) {
            Artikel artikel2 = ((Artikel)input.readObject());
           System.out.println(artikel2); 
        }
        catch (Exception e) {
            // TODO: handle exception
        }
    }
}
