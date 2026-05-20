package Herhalingsoefeningen.Module_3;

//m1: een iets minder eenvoudige klasse

/* Maak een klasse Adres. Een object van de klasse kan de adresgegevens van een persoon bijhouden. Een adres bevat minstens de volgende gegevens:
straatnaam
huisnummer (enkel cijfers)
bus
postcode (exact 4 cijfers)
woonplaats
Denk zelf na over de meest geschikte types om bv. tekst of getallen bij te houden.
Zorg er voor dat je zeker een constructor hebt waar je alles aan kan meegeven.
Zorg ook voor getters en setters.
Voeg ook nog een functie toe waarmee je alle gegevens in de console kan afdrukken.
Als uitdaging voorzie je ook nog een controle bij het invoeren van een postcode, dit moet uit exact 4 cijfers bestaan en anders vervang je de invoer door 9999.
 */

public class Adres {
    //fields
    private String straatnaam, woonplaats;
    private int huisnummer, postcode;
    private char bus;

    //constructor
    public Adres(String straatnaam, String woonplaats, int postcode, int huisnummer, char bus) {
        this.straatnaam = straatnaam;
        this.woonplaats = woonplaats;
        if (postcode < 1000 || postcode > 9999) {
            this.postcode = 9999;
        } else {
            this.postcode = postcode;
        }
        this.huisnummer = huisnummer;
        this.bus = bus;
    }


    //setters
    public void setBus(char bus) {
        this.bus = bus;
    }

    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
    }

    public void setPostcode(int postcode) {
        if (postcode < 1000 || postcode > 9999) {
            this.postcode = 9999;
        } else {
            this.postcode = postcode;
        }
    }

    public void setStraatnaam(String straatnaam) {
        this.straatnaam = straatnaam;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    //getters
    public char getBus() {
        return bus;
    }
    
    public int getHuisnummer() {
        return huisnummer;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getStraatnaam() {
        return straatnaam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public String toString() {
        return postcode + " " + woonplaats + " " + straatnaam + " " + huisnummer + " " + bus;
    }


    public static void main(String[] args) {
        Adres pizzAdres = new Adres("Straat","Leuven",8080,80,'a');
        System.out.println(pizzAdres.getBus());
        System.out.println(pizzAdres.getHuisnummer());
        System.out.println(pizzAdres.getPostcode());
        System.out.println(pizzAdres.getStraatnaam());
        System.out.println(pizzAdres.getWoonplaats());
        pizzAdres.setPostcode(10000);
        System.out.println(pizzAdres.getPostcode());
        
    }
}