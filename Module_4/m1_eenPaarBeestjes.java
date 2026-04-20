package Module_4;


class Huisdier {
    
    private double gewicht;
    private double leeftijd;
    private String naam;


    //constructor
    public Huisdier(double gewicht, double leeftijd, String naam) {
        this.gewicht = gewicht;
        this.leeftijd = leeftijd;
        this.naam = naam;
    }

    //getters
    public double getGewicht() {
        return this.gewicht;
    }

    public double getLeeftijd() {
        return this.leeftijd;
    }

    public String getNaam() {
        return this.naam;
    }

    //setters
    public double setGewicht(double gewicht) {
        this.gewicht = gewicht;
        return this.gewicht;
    } 

    public double setLeeftijd(double leeftijd) {
        this.leeftijd = leeftijd;
        return this.leeftijd;
    }
    
    public String setNaam(String naam) {
        this.naam = naam;
        return this.naam;
    }

    //toString
    public void print() {
        System.out.println(this.naam + " weegt " + this.gewicht + " en is " + this.leeftijd + " jaar oud");    
    }
}

class Hond extends Huisdier{

    private int stamboeknummer;

    //constructor
    Hond(double gewicht, double leeftijd, String naam, int stamboeknummer) {
        super(gewicht, leeftijd, naam);
        this.stamboeknummer = stamboeknummer;
    }

    //getters
    void getStamboeknummer() {
        System.out.println(this.stamboeknummer);
    }

    //setters
    int setStamboeknummer(int stamboeknummer) {
        this.stamboeknummer = stamboeknummer;
        return this.stamboeknummer;
    }

    //toString
    public void print() {
        System.out.println(this.getNaam() + " met stamboeknummer " + this.stamboeknummer + " weegt " + this.getGewicht() + " en is " + this.getLeeftijd() + " jaar oud");
    }
}

public class m1_eenPaarBeestjes {
    public static void main(String[] args) {
        Huisdier huisdier1 = new Huisdier(4.2, 2, "Milo");
        Huisdier huisdier2 = new Huisdier(1.1, 1, "Luna");

        Hond hond1 = new Hond(18.7, 5, "Rex", 10234);
        Hond hond2 = new Hond(27.3, 7, "Boris", 20456);

        huisdier1.print();
        huisdier2.print();
        hond1.print();
        hond2.print();
    }
}


