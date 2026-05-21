package Herhalingsoefeningen.Module_6.m1_2fast2leasing;

import java.util.TreeMap;

public class VerhuurSysteem {
    //fields
    private TreeMap<String, Wagen> wagens;
    //constructor
    public VerhuurSysteem() {
        this.wagens = new TreeMap<>();
    }
    //extra
    public boolean voegWagenToe(String nummerplaat, Wagen wagen) {
        if (wagens.containsKey(nummerplaat)) {
            return false;
        } else {
            wagens.put(nummerplaat, wagen);
            return true;
        }
    }

    public Wagen zoekWagen(String nummerplaat) {
        return wagens.get(nummerplaat);
    }

    public boolean verhuurWagen(String nummerplaat) {
        Wagen wagen = this.zoekWagen(nummerplaat);
        return wagen.verhuur();
    }
    
    public boolean brengWagenTerug(String nummerplaat) {
        Wagen wagen = this.zoekWagen(nummerplaat);
        return wagen.brengTerug();
    }

    public static void main(String[] args) {
        VerhuurSysteem systeem = new VerhuurSysteem();

        // Wagens aanmaken
        Wagen w1 = new Wagen("SN001", "Diesel", 5);
        Wagen w2 = new Wagen("SN002", "Elektrisch", 4);
        Wagen w3 = new Wagen("SN003", "Benzine", 7);

        // Wagens toevoegen aan het systeem
        systeem.voegWagenToe("1-ABC-123", w1);
        systeem.voegWagenToe("2-ZZZ-999", w2);
        systeem.voegWagenToe("1-BBB-456", w3);

        // Wagen opzoeken
        System.out.println("Zoek 1-ABC-123:");
        System.out.println(systeem.zoekWagen("1-ABC-123"));

        // Wagen verhuren
        System.out.println("\nProbeer 1-ABC-123 te verhuren:");
        if (systeem.verhuurWagen("1-ABC-123")) {
            System.out.println("Wagen is verhuurd!");
        } else {
            System.out.println("Kon niet verhuren.");
        }

        // Nog eens proberen (moet mislukken)
        System.out.println("\nNog eens proberen te verhuren:");
        if (systeem.verhuurWagen("1-ABC-123")) {
            System.out.println("Wagen is verhuurd!");
        } else {
            System.out.println("Kon niet verhuren (al verhuurd?).");
        }

        // Wagen terugbrengen
        System.out.println("\nBreng wagen terug:");
        if (systeem.brengWagenTerug("1-ABC-123")) {
            System.out.println("Wagen is teruggebracht!");
        } else {
            System.out.println("Kon niet terugbrengen.");
        }
    }
}
