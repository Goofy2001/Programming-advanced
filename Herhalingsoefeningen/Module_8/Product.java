package Herhalingsoefeningen.Module_8;

import java.io.ObjectOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;

public class Product {
    //fields
    private String naam;
    private double prijs;
    //constructors
    public Product(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    public double getPrijs() {
        return prijs;
    }

    @Override
    public String toString() {
        return this.naam;
    }
}



class Factuur {
    //fields
    public final LocalDate datum;
    public HashSet<Product> productenlijst;
    //constructor
    public Factuur() {
        this.datum = LocalDate.now();
        this.productenlijst = new HashSet<>();
    }

    //extra
    public void productToevoegen(Product product1) {
        this.productenlijst.add(product1);
    }

    public void genereerFactuur() {
        double totaalprijs = 0.00;
        String productList = "";
        for (Product product : productenlijst) {
            productList = productList + " | " + product.toString();
            totaalprijs += product.getPrijs();
        }
        String factuur = productList + " ||| " + String.valueOf(totaalprijs);


        String bestandsnaam = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss")) + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./Herhalingsoefeningen/Module_8/" + bestandsnaam))) {
            writer.write(factuur);
        } catch(Exception e) {}
    }

    public static void main(String[] args) {

        // Maak een factuur-object aan (of hoe jouw klasse ook heet)
        Factuur factuur = new Factuur();

        // Voeg enkele testproducten toe
        factuur.productToevoegen(new Product("Boterhammen", 4.50));
        factuur.productToevoegen(new Product("Koffie", 2.20));
        factuur.productToevoegen(new Product("Chocoladekoek", 3.10));

        // Genereer de factuur (schrijft naar .txt)
        factuur.genereerFactuur();

        System.out.println("Factuur gegenereerd!");
    }
}