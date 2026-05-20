package Herhalingsoefeningen.Module_4;

import java.time.chrono.JapaneseChronology;

import Herhalingsoefeningen.Module_3.Adres;

//e1: herhaling klasse

/* Maak een klasse Persoon, van een persoon willen we de volgende gegevens opslaan:
Voornaam
Achternaam
email
adres (Object van klasse Adres, dat mag je uit de oefeningen van Classes overnemen)
Zorg voor een constructor waar je een persoon kan aanmaken met een voor- en achternaam.
Overschrijf ook nog de toString methode om de gegevens te kunnen afdrukken.
Om te testen of alles werkt maak je in je main klasse twee personen aan en geef je hen een adres.
Druk hun gegevens af om te controleren of correct is ingegeven.

Als uitdaging zoek je nog een manier toe om te tellen hoeveel personen er in totaal zijn aangemaakt.
Hiervoor kan je gebruik maken van static. */

public class Persoon {
    //field
    private String voornaam, achternaam, email;
    private Adres adres;
    private static int aantalPersonen = 0;

    // constructor
    public Persoon(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        aantalPersonen++;
    }

    //setter
    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public void setAdres(String straatnaam, String woonplaats, int postcode, int huisnummer, char bus) {
        setAdres(new Adres(straatnaam, woonplaats, postcode, huisnummer, bus));
    }

    //getter
    public static int getAantalPersonen() {
        return aantalPersonen;
    }

    //extra
    @Override
    public String toString() {
        String email = "";
        if (this.email != null) {
            email = " (" + this.email + ")";
        }
        return this.voornaam + " " + this.achternaam + email + "\n" + this.adres;
    }

    public static void main(String[] args) {
        Persoon jan = new Persoon("Jan", "Jansens");
        jan.setAdres("straat", "Leuven", 3000, 5, 'A');
        System.out.println(jan);
        System.out.println(Persoon.getAantalPersonen());
    }

        
}
