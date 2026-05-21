package Herhalingsoefeningen.Module_6.h1_2;

public abstract class Product implements Comparable<Product> {
    //field
    protected float prijs;
    protected String merknaam;
    protected String modelnummer;
    //constructor
    public Product(float prijs, String merknaam, String modelnummer) {
        this.prijs = prijs;
        this.merknaam = merknaam;
        this.modelnummer = modelnummer;
    }
    //getter
    public float getPrijs() {
        return prijs;
    }

    public String getMerknaam() {
        return merknaam;
    }
    //
    @Override
    public int compareTo(Product product) {
        return this.modelnummer.compareTo(product.modelnummer);
    }
    
}
