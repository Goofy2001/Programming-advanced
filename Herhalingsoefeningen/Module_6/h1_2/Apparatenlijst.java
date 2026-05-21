package Herhalingsoefeningen.Module_6.h1_2;

import java.util.*;

public class Apparatenlijst {

    private Map<String, List<Product>> producten;

    public Apparatenlijst() {
        this.producten = new HashMap<>();
        this.producten.put("Smartphones", new ArrayList<>());
        this.producten.put("Smartwatches", new ArrayList<>());
    }

    public List<Product> getLijst(String productsoort) {
        return producten.get(productsoort);
    }

    public void add(Smartphone smartphone) {
        List<Product> smartphones = producten.get("Smartphones");
        smartphones.add(smartphone);
        Collections.sort(smartphones); // sorteren op naam (Comparable)
    }

    public void add(Smartwatch smartwatch) {
        List<Product> smartwatches = producten.get("Smartwatches");
        smartwatches.add(smartwatch);
        Collections.sort(smartwatches); // sorteren op naam (Comparable)
    }

    public void addProduct(Product product) {
        if (product instanceof Smartphone) {
            add((Smartphone) product);
        } else if (product instanceof Smartwatch) {
            add((Smartwatch) product);
        }
    }

    // ⭐ Sorteren op naam (default Comparable)
    public void sorteerOpNaam(String soort) {
        Collections.sort(producten.get(soort));
    }

    // ⭐ Sorteren op prijs (inline comparator)
    public void sorteerOpPrijs(String soort) {
        producten.get(soort).sort(
                (p1, p2) -> Float.compare(p1.getPrijs(), p2.getPrijs()));
    }

    // ⭐ Sorteren op merknaam (inline comparator)
    public void sorteerOpMerk(String soort) {
        producten.get(soort).sort(
                (p1, p2) -> p1.getMerknaam().compareTo(p2.getMerknaam()));
    }

    public static void main(String[] args) {

        Apparatenlijst lijst = new Apparatenlijst();

        // Smartphones toevoegen
        lijst.add(new Smartphone(1099, "Apple", "iPhone 14", Schermresolutie.Xlarge));
        lijst.add(new Smartphone(799, "Samsung", "Galaxy S22", Schermresolutie.Large));
        lijst.add(new Smartphone(499, "Xiaomi", "Mi 11 Lite", Schermresolutie.Normal));

        // Smartwatches toevoegen
        lijst.add(new Smartwatch(399, "Apple", "Watch 8", Vorm.Vierkant));
        lijst.add(new Smartwatch(299, "Samsung", "Watch 5", Vorm.Rond));
        lijst.add(new Smartwatch(199, "Fitbit", "Versa 3", Vorm.Vierkant));

        System.out.println("=== Smartphones (gesorteerd op modelnaam) ===");
        for (Product p : lijst.getLijst("Smartphones")) {
            System.out.println(p);
        }

        System.out.println("\n=== Smartwatches (gesorteerd op modelnaam) ===");
        for (Product p : lijst.getLijst("Smartwatches")) {
            System.out.println(p);
        }
    }
}
