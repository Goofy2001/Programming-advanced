package Herhalingsoefeningen.Module_4;

//m1: een paar beestjes

/* Maak een Huisdier, huisdieren hebben een gewicht, leeftijd en naam.
Zorg voor een constructor, getters, setters en een toString functie.

Maak vervolgens een klasse hond die hier van gaat overerven.
Honden nemen alles over van een Huisdier en voegen nog een stamboeknummer toe.
Voorzie ook hiervoor een constructor, getters, setters en een toString functie.

Maak om alles te testen enkele huisdieren en honden aan en kijk wat er gebeurt als je hun gegevens afdrukt. */


public class Hond extends Huisdier {
    //field
    private String stamboeknummer;

    //constructor
    public Hond(String naam, int leeftijd, double gewicht, String stamboeknummer) {
        super(gewicht, leeftijd, naam);
        setStamboeknummer(stamboeknummer);;
    }

    //setter
    public void setStamboeknummer(String stamboeknummer) {
        this.stamboeknummer = stamboeknummer;
    }

    //extra
    @Override
    public String toString() {
        return super.toString() + ", en is een hond met stamnummer: " + this.stamboeknummer;
    }

    public static void main(String[] args) {
        Huisdier mops = new Huisdier(10, 3, "mops");
        System.out.println(mops);
        Hond fido = new Hond("Fido", 5, 20, "01259676500");
        System.out.println(fido);

    }
}
