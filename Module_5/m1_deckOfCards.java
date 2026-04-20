package Module_5;

//enum waarden
enum Waarde {
    AAS,TWEE,DRIE,VIER,VIJF,ZES,ZEVEN,ACHT,NEGEN,TIEN,BOER,DAME,HEER;
}

//enum kleuren
enum Kleur {
    HARTEN,RUITEN,SCHOPPEN,KLAVEREN;
}

class Kaart {
    Waarde waarde;
    Kleur kleur;

    //constructor
    Kaart(Waarde waarde, Kleur kleur) {
        this.waarde = waarde;
        this.kleur = kleur;
    }

    //print
    void toonKaart() {
        System.out.println(this.waarde + " van " + this.kleur);
    }
}

public class m1_deckOfCards {
    public static void main(String[] args) {
        Kaart[][] deck = new Kaart[4][13];
        for (Kleur kleur : Kleur.values()) {
            for (Waarde waarde : Waarde.values()) {
                deck[kleur.ordinal()][waarde.ordinal()] = new Kaart(waarde, kleur);
            }
        }

        for (int i = 0; i < deck.length; i++) {
            for (int j = 0; j < deck[i].length; j++) {
                deck[i][j].toonKaart();
            }
        }
    }
}
