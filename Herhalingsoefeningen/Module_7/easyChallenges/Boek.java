package Herhalingsoefeningen.Module_7.easyChallenges;

public class Boek implements interfaceBoeken {
    //field
    private String titel;
    private final int ISBN;

    static int teller = 1;
    //constructor
    public Boek(String titel) {
        this.titel = titel;
        this.ISBN = teller;
        teller++;
    }
    //getter
    @Override
    public int getISBN() {
        return this.ISBN;
    }

    @Override
    public String getTitel() {
        return this.titel;
    }

    //extra
    @Override
    public boolean equals(Object obj) {
        Boek boek = ((Boek)obj);
        return this.ISBN == boek.ISBN && this.titel.equals(boek.titel);
    }
}
