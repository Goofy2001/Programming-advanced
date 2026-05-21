package Herhalingsoefeningen.Module_5.m1_DeckOfCards;

public enum Waarde {
    //field
    Aas(1), Twee(2), Drie(3), Vier(4),
    Vijf(5), Zes(6), Zeven(7), Acht(8),
    Negen(9), Tien(10), Boer(11), Dame(12), Heer(13);
    private int waarde;
    //constructor
    private Waarde(int waarde) {
        this.waarde = waarde;
    }
    //getter
    public int getWaarde() {
        return waarde;
    }

}
