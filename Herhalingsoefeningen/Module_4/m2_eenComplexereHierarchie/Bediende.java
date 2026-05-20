package Herhalingsoefeningen.Module_4.m2_eenComplexereHierarchie;

public class Bediende extends Persoon {
    //field
    private Lokaal lokaal;

    //constructor
    public Bediende(Lokaal lokaal, String voornaam, String achternaam) {
        super(voornaam, achternaam);
        this.lokaal = lokaal;
    }

    public Bediende(Lokaal lokaal, Persoon persoon) {
        super(persoon.getVoornaam(), persoon.getAchternaam());
        this.lokaal = lokaal;
    }

    //extra
    protected void setLokaal(Lokaal lokaal, Bediende bediende) {
        bediende.lokaal = lokaal;
    }

    public static void main(String[] args) {
        Lokaal lokaal = new Lokaal("straat", "Leuven", 4000, 34, 'B', "campus A", 3, "ABBA");
        Bediende Sam = new Bediende(lokaal, "Sam", "Wilkens");

        System.out.println(Sam.getAchternaam());
    }
}
