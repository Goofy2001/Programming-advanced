package Herhalingsoefeningen.Module_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CSVreaderAndWriter {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("./Herhalingsoefeningen/Module_8/input.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                //deel 2
                String[] puntenlijstArray = line.split(",");
                ArrayList<Double> puntenlijst = new ArrayList<Double>();
                for (String punt : puntenlijstArray) {
                    puntenlijst.add(Double.valueOf(punt));
                }
                //gemiddelde berekenen
                int aantal = 0;
                int som = 0;
                for (Double punt : puntenlijst) {
                    som += punt;
                    aantal++;
                }
                System.out.println("Het gemiddelde is " + som/aantal);


                


            }
        } catch (Exception e) {
            System.out.println("Er ging iets mis bij het lezen van het bestand");
        }

        

    }
}