package Module_2;

import java.util.Arrays;
import java.util.Scanner;

public class m1_doorDeHeleLijst {
    public static void main(String[] args) {
        int[] getallenArray = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < getallenArray.length; i++) {
            System.out.println("Geef een getal: ");
            int invoer = in.nextInt();
            getallenArray[i] = invoer;
        }
        int som = 0;
        for (int i = 0; i < getallenArray.length; i++) {
            som += getallenArray[i];
        }
        System.out.println("Het gemiddelde van " + Arrays.toString(getallenArray) + " is : " + (som/getallenArray.length));
    }
}
