package Herhalingsoefeningen.Module_1;
public class Challenges {

    //e1: loops en selecties
    /* Schrijf code waarmee je alle even getallen tussen 36 en 60 kan afdrukken. Maak hiervoor gebruik van een for loop.
    Als je vorige oplossing werkt probeer je dit opnieuw met een while loop */
    public static void printForEvenNumbers(int number1, int number2) {
        for (int i = number1; i <= number2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printWhileEvenNumbers(int number1, int number2) {
        int i = number1;
        while (i <= number2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    /* public static void main(String[] args) {
        printForEvenNumbers(36, 60);
        printWhileEvenNumbers(36, 60);
    } */

    //m1: Sterrenpiramide
    /* Maak een variabele hoogte, hiervoor gebruik je een klein geheel getal.
    We gaan aan de hand van hoogte een sterrenpiramide bouwen. Per laag van de piramide komt er een ster bij.
    Dus bijvoorbeeld als hoogte gelijk is aan 4 zal de afgedrukte piramide er zo uit zien:

    *
    **
    ***
    **** */

    public static void printStarPiramid(int height) {
        for (int i = 1; i <= height; i++) {
            String line = "";
            for (int j = 1; j <= i ; j++) {
                line += "*";
                
            }
            System.out.println(line);
        }
    }

   /* public static void main(String[] args) {
    printStarPiramid(4);
   } */

    //h1: meerLogica
    /* Vraag twee getallen aan de gebruiker.
    Zoek de grootste gemene deler van deze twee getallen en druk deze af in je console. */

    public static void biggestCommonDivider(int number1, int number2) {
        if (number1 >= number2) {
            for (int i = number2; i > 0; i--) {
                if (number2 % i == 0 && number1 % i == 0) {
                    System.out.println(i);
                    return;
                }
            }
        } else {
            for (int i = number1; i > 0; i--) {
                if (number1 % i == 0 && number2 % i == 0) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println("Er is geen gemeenschappelijke deler");
    }

    public static void main(String[] args) {
        biggestCommonDivider(15, 5);
    }
}
