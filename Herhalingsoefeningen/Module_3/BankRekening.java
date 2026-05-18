package Herhalingsoefeningen.Module_3;

//@1: en nog een laatste klasse

/* Op een BankRekening staat een bepaald bedrag.
Voorzie een default constructor die dat bedrag op 0.0 zet, en een tweede constructor die toelaat om een positieve double door te geven.
Als er een negatief getal doorgegeven wordt, mag je het bedrag van de bankrekening op 0 zetten.
Voorzie een getter en setter voor het bedrag.
We laten niet toe dat de gebruiker de setter zelf mag gebruiken, gebruik de juiste zichtbaarheid dat de setter enkel binnen deze klasse zelf gebruikt kan worden.
Voorzie methoden om geld te storten en om geld af te halen.
Bij een afhaling mag je onder 0 gaan, maar niet meer dan 1000 euro.
Als dat wel het geval zou zijn, mag je de afhaling weigeren en voert de functie niets uit.
Druk in dat geval een foutmelding af in de console. */

public class BankRekening {
    //field
    private double bedrag;

    //constructor
    public BankRekening() {
        this.bedrag = 0;
    }

    public BankRekening(double bedrag) {
        if (bedrag >= 0) {
            this.bedrag = bedrag;
        } else {
            this.bedrag = 0;
        }
    }

    //getter
    public double getBedrag() {
        return bedrag;
    }

    //setter
    private void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }

    //extra
    public void storten(double bedrag) {
        if (bedrag <= 0) {
            System.out.println("Je kan geen negatief bedrag storten");
        } else {
            setBedrag(this.bedrag + bedrag);;
        }
    }

    public void afhalen(double bedrag) {
        if (bedrag <= 0) {
            System.out.println("Je kan geen negatief bedrag afhalen");
        } else {
            if (this.bedrag - bedrag <= -1000) {
                System.out.println("Je hebt het laagste saldo bereikt");
            } else {
                setBedrag(this.bedrag - bedrag);
            }
        }
    }

    //print
    public void print() {
        System.out.println("Het saldo is : " + this.bedrag);
    }
}
