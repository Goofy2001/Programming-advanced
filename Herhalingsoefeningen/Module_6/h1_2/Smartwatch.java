package Herhalingsoefeningen.Module_6.h1_2;

public class Smartwatch extends Product implements WelkeVorm {
    // fields
    private Vorm vorm;

    // constructor
    public Smartwatch(float prijs, String merknaam, String modelnummer, Vorm vorm) {
        super(prijs, merknaam, modelnummer);
        this.vorm = vorm;
    }

    // extra
    public Vorm getVorm() {
        return vorm;
    }

    @Override
    public String toString() {
        return "Smartwatch: " + merknaam + " " + modelnummer;
    }

    public static void main(String[] args) {

        Smartwatch w1 = new Smartwatch(299, "Samsung", "Watch 5", Vorm.Rond);
        Smartwatch w2 = new Smartwatch(399, "Apple", "Watch 8", Vorm.Vierkant);
        Smartwatch w3 = new Smartwatch(199, "Fitbit", "Versa 3", Vorm.Vierkant);

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
    }
}
