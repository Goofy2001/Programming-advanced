package Herhalingsoefeningen.Module_6.h1_2;

public class Smartphone extends Product {
    //fields
    private Schermresolutie resolutie;
    //constructor
    public Smartphone(float prijs, String merknaam, String modelnummer, Schermresolutie resolutie) {
        super(prijs, merknaam, modelnummer);
        this.resolutie = resolutie;
    }
    //extra
    @Override
    public String toString() {
        return "Smartphone: " + merknaam + " " + modelnummer;
    }

    public static void main(String[] args) {

        Smartphone s1 = new Smartphone(799, "Samsung", "Galaxy S22", Schermresolutie.Large);
        Smartphone s2 = new Smartphone(1099, "Apple", "iPhone 14", Schermresolutie.Xlarge);
        Smartphone s3 = new Smartphone(499, "Xiaomi", "Mi 11 Lite", Schermresolutie.Normal);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
