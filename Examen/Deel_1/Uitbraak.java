package Examen.Deel_1;

public class Uitbraak {
    //fields
    private String identificatiecode;
    private int aantalPatienten;

    //constructor
    public Uitbraak(String identificatiecode, int aantalPatienten) {
        this.identificatiecode = identificatiecode;
        this.aantalPatienten = aantalPatienten;
    }
    //getter
    public int getAantalPatienten() {
        return aantalPatienten;
    }

    public String getIdentificatiecode() {
        return identificatiecode;
    }

    //toString
    @Override
    public String toString() {
        return this.identificatiecode + String.valueOf(this.aantalPatienten);
    }

    //equals
    @Override
    public boolean equals(Object obj) { //werkt niet
        Uitbraak uitbraak1 = ((Uitbraak)this);
        Uitbraak uitbraak2 = ((Uitbraak)obj);
        return uitbraak1.toString() == uitbraak2.toString();
    }
}