package Herhalingsoefeningen.Module_4.h1_beestjes2_revengeance;

import java.time.LocalDate;

public class DierenTester {
    public static void main(String[] args) {
        // maak dieren
        Eend eend = new Eend(LocalDate.of(2020, 5, 6));
        Kikker kikker = new Kikker(LocalDate.now());
        Noordzeezalm noordzeezalm = new Noordzeezalm(LocalDate.now());
        Pinguin pinguin = new Pinguin(LocalDate.now());
        Slang slang = new Slang(LocalDate.now());
        Tijger tijger = new Tijger(LocalDate.now());
        Vleermuis vleermuis = new Vleermuis(LocalDate.now());
        // dieren in array
        Dier[] dieren = new Dier[7];
        dieren[0] = eend;
        dieren[1] = kikker;
        dieren[2] = noordzeezalm;
        dieren[3] = pinguin;
        dieren[4] = slang;
        dieren[5] = tijger;
        dieren[6] = vleermuis;
        // in juiste ding
        Dier[] kooi = new Dier[7];
        Dier[] vijver = new Dier[7];
        int aantalZwem = 0;
        int aantalVlieg = 0;
        for (int i = 0; i < dieren.length; i++) {
            if (dieren[i] instanceof KanZwemmen) {
                vijver[aantalZwem] = dieren[i];
                aantalZwem++;
            }
            if (dieren[i] instanceof KanVliegen) {
                kooi[aantalVlieg] = dieren[i];
                aantalVlieg++;
            }
        }
        // geluiden
        System.out.println("Vijver: ");
        for (int i = 0; i < aantalZwem; i++) {
            System.out.println(vijver[i].maakGeluid());
        }
        System.out.println("Kooi: ");
        for (int i = 0; i < aantalVlieg; i++) {
            System.out.println(kooi[i].maakGeluid());
        }

    }
}
