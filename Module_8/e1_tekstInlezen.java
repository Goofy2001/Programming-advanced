
package Module_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;



public class e1_tekstInlezen {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(Paths.get("Module_8", "punten.csv").toFile()))){
            String currentLine;
            StringBuilder tekst = new StringBuilder();
            while ((currentLine = reader.readLine()) != null) {
                tekst.append(currentLine);
            }
            System.out.println(tekst);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}