package Herhalingsoefeningen.Module_3;

//h1: klasse auto

/*
Maak een klasse Auto. Een auto heeft een kilometerteller, een brandstoftank met een inhoud in liter en een verbruik (aantal liter per 100km). Gebruik voor deze gegevens een double als datatype.

Voorzie minstens twee constructors, één die toelaat aan alle gegevens een beginwaarde te geven en één die werkt met een aantal default waarden (nieuwe auto, lege tank). Je hoeft geen bijkomende controles uit te voeren. Je mag er van uitgaan dat de gebruiker altijd realistische waarden gebruikt.

Voorzie een methode om de tank bij te vullen (altijd tot ze vol is). Voorzie een methode om een gegeven aantal km te rijden. In dit geval telt de kilometerteller altijd vooruit (ook alsje een negatief getal ingeeft). Er wordt steeds brandstof verbruikt. Hou er rekening mee dat er mogelijk te weinig brandstof kan zijn om de volledige afstand te rijden. In dat geval wordt er gereden tot de tank leeg is. Eens klaar geeft de methode het aantal gereden km als returnwaarde.

Voorzie ook een methode om alle relevante gegevens van een Auto object af te drukken. */

public class Auto {
    //fields
    private double kilometerteller;
    private double brandstoftank;
    private double verbruik;
    private double brandstof;

    //constructor
    public Auto(double kilometerteller, double brandstoftank, double verbruik, double brandstof) {
        this.kilometerteller = kilometerteller;
        this.brandstoftank = brandstoftank;
        this.verbruik = verbruik;
        this.brandstof = brandstof;
    }

    public Auto(double verbruik, double brandstoftank) {
        this.kilometerteller = 0;
        this.brandstoftank = brandstoftank;
        this.verbruik = verbruik;
        this.brandstof = 0;
    }

    //extra
    public void bijtanken() {
        this.brandstof = this.brandstoftank;
    }

    public double rijden(double kilometers) {
        if (Math.abs(kilometers)*this.verbruik >= brandstof) {
            this.brandstof -= Math.abs(kilometers)*this.verbruik;
            this.kilometerteller += Math.abs(kilometers);
            return kilometers;
        } else {
            double afstand = this.brandstof/this.verbruik;
            this.kilometerteller += afstand;
            this.brandstof = 0;
            return afstand;
        }
    }
}
