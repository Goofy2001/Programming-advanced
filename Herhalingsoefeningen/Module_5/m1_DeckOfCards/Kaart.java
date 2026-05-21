package Herhalingsoefeningen.Module_5.m1_DeckOfCards;

public class Kaart {
    //fields
    private Waarde waarde;
    private Symbool symbool;
    //constructor
    public Kaart(Symbool symbool, Waarde waarde) {
        this.symbool = symbool;
        this.waarde = waarde;
    }

    //getter
    public Waarde getWaarde() {
        return waarde;
    }

    //extra
    @Override
    public String toString() {
        return symbool + " " + waarde;
}

}

