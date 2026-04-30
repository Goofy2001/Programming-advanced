package Module_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class e2_tekstVerwerken {
        public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(Paths.get("Module_8", "punten.csv").toFile()))){
            String currentLine;
            StringBuilder tekst = new StringBuilder();
            while ((currentLine = reader.readLine()) != null) {
                tekst.append(currentLine).append(" ");
            }
            System.out.println(tekst);
            String[] getallen = tekst.toString().split("[,\\s]+");
            int aantal = 0;
            double som = 0;
            for (int i = 0; i< getallen.length; i++) {
                double getal = Double.parseDouble(getallen[i]);
                som+=getal;
                aantal++;
            }
            System.out.println("Het gemiddelde is " + som/aantal);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
