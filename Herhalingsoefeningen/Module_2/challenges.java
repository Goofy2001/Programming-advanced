package Herhalingsoefeningen.Module_2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

class challenges {
    /* //e1: test arrays
    Indien je zelf iets wil invoeren kan je gebruik maken van onderstaande code.

            Scanner in = new Scanner(System.in);
            String invoer = in.nextLine();
        
    Maak een array aan met 10 plaatsen waar je gehele getallen kan in bijhouden. Op deze array voer je vervolgens enkele bewerkingen uit.

    Vul de array op zodat elke index de waarde 5 bevat
    Pas de tweede waarde aan zodat dit nu 23 bevat
    Probeer op de derde index de waarde 1.5 te plaatsen, lukt dit?
    Schrijf een loop waarmee je elke waarde binnen de array kan afdrukken als “element i = waarde */

    /**
     * @param args
     */
    /* public static void main(String[] args) {
        int[] allFiveArray = new int[10];
        for (int i = 0; i < allFiveArray.length; i++) {
            allFiveArray[i] = 5;
        }
        System.out.println(Arrays.toString(allFiveArray));

        allFiveArray[1] = 23;
        System.out.println(Arrays.toString(allFiveArray));

        //allFiveArray[3] = 1.5; is geen int

        for (int i = 0; i < allFiveArray.length; i++) {
            System.out.println("element i = " + allFiveArray[i]);
        }
    } */

    //e2: test strings

    /*
    Maak twee Strings aan, in de eerste plaats je “the quick brown fox” en in de tweede “Jumps over the lazy dog”. Voeg beide strings samen tot een nieuwe string.
    Vervang in de vorige String het woord “fox” door “cat”. Zoek hiervoor op welke functie je kan gebruiken. */

    /* public static void main(String[] args) {
        String firstString = "the quick brown fox";
        String secondString = "Jumps over the lazy dog";

        String longString = firstString + " " + secondString;
        System.out.println(longString);

        longString = longString.replace("fox", "cat");
        System.out.println(longString);
    } */

    //m1: door de hele lijst
    /* Maak een array aan waar je vijf verschillende gehele getallen in plaatst.
    Schrijf vervolgens code uit om de gemiddelde waarde van deze getallen te berekenen. */

    /* public static void main(String[] args) {
        //input variabele
        Scanner in = new Scanner(System.in);
        int[] numbersArray = new int[5];
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print("typ getal " + (i+1) + ": ");
            String invoer = in.nextLine();
            numbersArray[i] = Integer.parseInt(invoer);
        }
        //berekenen gemiddelde
        int total = 0;
        for (int j = 0; j < numbersArray.length; j++) {
            total += numbersArray[j];
        }
        int mean = total/numbersArray.length;
        System.out.println(mean);
    } */

    //h1: afsprakenkalender

    /* Start met het maken van een array waar je 5 datums kan in bijhouden.
    Vervolgens ga je deze opvullen met fictieve doktersafspraken.
    Voor het eerste element in de lijst neem je de datum vandaag.
    Elk volgend element is 15 dagen verder. */

    /* public static void main(String[] args) {
        LocalDate[] kalender = new LocalDate[5];
        for (int i = 0; i < kalender.length; i++) {
            kalender[i] = LocalDate.now().plusDays(i*15);
        }
        System.out.println(Arrays.toString(kalender));
    } */
}
