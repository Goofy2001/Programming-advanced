package Herhalingsoefeningen.Module_3;

//e1: een eenvoudige klasse

/* Maak een klasse Cirkel die als gegevens de straal van de cirkel en de kleur bevat. Zorg voor een aantal constructoren zodat je een Cirkel kan aanmaken zonder parameters, met slechts één argument (straal, kleur) of met beide parameters (straal en kleur). Tenzij anders ingegeven is de straal 0 en de kleur wit. Maak (uiteraard) ook getters en setters. Zorg tenslotte voor de volgende extra methoden:

print() om de cirkel (straal en kleur) af te printen.
geefOmtrek() : 2 * pi * r , met r als straal
geefOppervlakte() : pi * r * r
Voor de waarde van pi kan je Math.PI gebruiken. */

public class Cirkel {
    //fields aanmaken
    private int straal;
    private String kleur;

    //constructor met parameters
    public Cirkel(int straal, String kleur) {
        this.straal = straal;
        this.kleur = kleur;
    }

    //constructor met 1 parameter
    public Cirkel(int straal) {
        this.straal = straal;
        this.kleur = "wit";
    }
    public Cirkel(String kleur) {
        this.kleur = kleur;
        this.straal = 0;
    }

    //constructor zonder parameter
    public Cirkel() {
        this.kleur = "wit";
        this.straal = 0;
    }

    //getters
    public String getKleur() {
        return kleur;
    }

    public int getStraal() {
        return straal;
    }

    //setters
    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public void setStraal(int straal) {
        this.straal = straal;
    }

    //extra
    public void print() {
        System.out.println("cirkel ("+straal+" en "+kleur+")");
    }

    public double geefOmtrek() {
        return 2 * Math.PI * this.straal;
    }

    public double geefOppervlakte() {
        return Math.PI * this.straal * this.straal;
    }

    public static void main(String[] args) {
        Cirkel blauw_zes = new Cirkel(6, "blauw");

        System.out.println(blauw_zes.getKleur());
        System.out.println(blauw_zes.getStraal());

        blauw_zes.setKleur("wit");
        blauw_zes.setStraal(7);

        System.out.println(blauw_zes.getKleur());
        System.out.println(blauw_zes.getStraal());

        System.out.println(blauw_zes.geefOmtrek());
        System.out.println(blauw_zes.geefOppervlakte());   
    }
}
