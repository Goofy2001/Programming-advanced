package Herhalingsoefeningen.Module_5.m1_DeckOfCards;

public class pakKaarten {
    public static Kaart[][] maakPak() {
        Kaart[][] pakKaarten = new Kaart[4][13];
        for (Symbool symbool : Symbool.values()) {
            for (Waarde waarde : Waarde.values()) {
                pakKaarten[symbool.ordinal()][waarde.ordinal()] = new Kaart(symbool, waarde);
            }
        }
        return pakKaarten;
    }

    public static void main(String[] args) {
        Kaart[][] pak = maakPak();
        for (int i = 0; i < pak.length; i++) {
            for (int j = 0; j < pak[i].length; j++) {
                System.out.println(pak[i][j]);
            }
        };
    }
    
}
