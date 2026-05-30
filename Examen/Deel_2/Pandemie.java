package Examen.Deel_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.HashSet;

import Examen.Deel_1.BacterieleUitbraak;
import Examen.Deel_1.Meldbaar;

public class Pandemie implements Meldbaar, Comparable {
    //fields
    HashMap<BacterieleUitbraak, String> verantwoordelijke = new HashMap<>();
    //constructor
    public Pandemie() {
        this.verantwoordelijke = new HashMap<>();
    }
    //extra
    @Override
    public void stuurAlert() {
        return;
    }

    public int berekenTotaalAantalPatienten() {
        int totaal = 0;
        for (String overheidsinstantie : verantwoordelijke) {
            totaal += verantwoordelijke.getKey(overheidsinstantie).getAantalPatienten;
        }
    }

    public ArrayList<BacterieleUitbraak> geefGesorteerdeUitbraken() {
        ArrayList<BacterieleUitbraak> lijstUitbraken = new ArrayList<BacterieleUitbraak>();
        compareTo(lijstUitbraken)
    }
}
