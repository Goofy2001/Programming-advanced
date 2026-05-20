package Herhalingsoefeningen.Module_4.m2_eenComplexereHierarchie;

import Herhalingsoefeningen.Module_3.Adres;;
// Een Lokaal bestaat uit een adres, gebouw (bv. blok A), een verdieping en lokaalnummer

public class Lokaal extends Adres {
    //field
    private String gebouw;
    private int verdieping;
    private String lokaalnummer;

    //constructor
    public Lokaal(String straatnaam, String woonsplaats, int postcode, int huisnummer, char bus, String gebouw, int verdieping, String lokaalnummer) {
        super(straatnaam, woonsplaats, postcode, huisnummer, bus);
        this.gebouw = gebouw;
        this.verdieping = verdieping;
        this.lokaalnummer = lokaalnummer;
    }

    //extra
    @Override
    public String toString() {
        return "Adres: " + super.toString() + " | Gebouw: " + gebouw + " | Verdieping: " + verdieping + " | Lokaal: " + lokaalnummer;
}


    public static void main(String[] args) {
        Lokaal hogentLokaal = new Lokaal("straat", "Gent", 9000, 12, 'B', "Campus Schoonmeersen", 3, "B3.001");
        System.out.println(hogentLokaal.getHuisnummer());
        System.out.println(hogentLokaal.toString());
    }
}
