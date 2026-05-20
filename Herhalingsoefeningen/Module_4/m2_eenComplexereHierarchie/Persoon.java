package Herhalingsoefeningen.Module_4.m2_eenComplexereHierarchie;

public class Persoon {
    //fields
    private String voornaam;
    private String achternaam;

    //constructor
    public Persoon(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    //getter
    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    //extra
    @Override
    public String toString() {
        return this.voornaam + " " + this.achternaam;
    }
}