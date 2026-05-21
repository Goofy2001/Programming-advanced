package Herhalingsoefeningen.Module_5.h1_pickACardAnyCard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import Herhalingsoefeningen.Module_5.m1_DeckOfCards.Kaart;
import Herhalingsoefeningen.Module_5.m1_DeckOfCards.Symbool;
import Herhalingsoefeningen.Module_5.m1_DeckOfCards.Waarde;

public class HogerOfLager {
    public static void main(String[] args) {
        // kaarten maken:
        List<Kaart> pakKaarten = new ArrayList<>();
        for (Symbool s : Symbool.values()) {
            for (Waarde w : Waarde.values()) {
                pakKaarten.add(new Kaart(s, w));
            }
        }
        // shuffle
        Collections.shuffle(pakKaarten);
        // start game
        Scanner in = new Scanner(System.in);
        int score = 0;

        Kaart huidige = pakKaarten.get(score);

        System.out.println("-- Start Game (give input (H or L)");

        while (score < pakKaarten.size() - 1) {
            System.out.println("Kaart: " + huidige);
            System.out.print("H of L: ");
            String invoer = in.nextLine();

            Kaart volgende = pakKaarten.get(score+1);

            boolean gokHoger = invoer.equalsIgnoreCase("H");
            boolean gokLager = invoer.equalsIgnoreCase("L");

            int waardeHuidige = huidige.getWaarde().getWaarde();
            int waardeVolgende = volgende.getWaarde().getWaarde();

            boolean isHoger = waardeVolgende > waardeHuidige;
            boolean isLager = waardeVolgende < waardeHuidige;

            if ((gokHoger && isHoger) || (gokLager && isLager)) {
                System.out.println("Juist! De volgende kaart is: " + volgende);
                score++;
                huidige = volgende;
            } else {
                System.out.println("Fout! De volgende kaart was: " + volgende);
                System.out.println("Je eindscore: " + score);
                break;
            }
        }
        System.out.println("Spel gedaan!");
    }
}
