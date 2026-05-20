package Herhalingsoefeningen.Module_4;

//m1: een paar beestjes

/* Maak een Huisdier, huisdieren hebben een gewicht, leeftijd en naam.
Zorg voor een constructor, getters, setters en een toString functie.

Maak vervolgens een klasse hond die hier van gaat overerven.
Honden nemen alles over van een Huisdier en voegen nog een stamboeknummer toe.
Voorzie ook hiervoor een constructor, getters, setters en een toString functie.

Maak om alles te testen enkele huisdieren en honden aan en kijk wat er gebeurt als je hun gegevens afdrukt. */

public class Huisdier {
    //fields
    private double gewicht;
    private int leeftijd;
    private String naam;

    //constructor
    public Huisdier(double gewicht, int leeftijd, String naam) {
        this.gewicht = gewicht;
        this.leeftijd = leeftijd;
        this.naam = naam;
    }

    //getters
    public double getGewicht() {
        return gewicht;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    //setters
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    //extra
    public String toString() {
        return "naam: " + this.naam + "/ gewicht: " + gewicht + "/ leeftijd: " + leeftijd;
    }
}
