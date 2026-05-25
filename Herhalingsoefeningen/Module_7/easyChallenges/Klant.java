package Herhalingsoefeningen.Module_7.easyChallenges;

import java.util.HashMap;
import Herhalingsoefeningen.Module_7.easyChallenges.BoekInMandjeError;

public class Klant {
    //fields
    private String naam;
    private HashMap<Boek, Double> boodschappenlijst;
    //constructor
    public Klant(String naam) {
        this.naam = naam;
        this.boodschappenlijst = new HashMap<>();
    }
    //extra
    public void toevoegenAanMandje(Boek boek, Double prijs) {
        try {
            if (!this.boodschappenlijst.containsKey(boek)) {
                this.boodschappenlijst.put(boek, prijs);
            } else {
                throw new BoekInMandjeError("Boek is al in mandje");
            }
        } catch (BoekInMandjeError e) {
            System.out.println(e.getMessage());
        }
    }

    public void verwijderUitMandje(Boek boek) {
        try {
            if (this.boodschappenlijst.containsKey(boek)) {
                this.boodschappenlijst.remove(boek);
            } else {
                throw new BoekNietInMandjeException("Boek zit niet in het mandje");
            }
        } catch (BoekNietInMandjeException e) {
            System.out.println(e.getMessage());
        }
    }
}
