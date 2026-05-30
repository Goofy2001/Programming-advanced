package Examen.Deel_3;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Examen.Deel_1.Uitbraak;

public class MonitoringsZone {
    //fields
    private String zonecode, naam;
    Uitbraak[] uitbraken = new Uitbraak[10];
    //constructor
    public MonitoringsZone(String zonecode, String naam, Uitbraak[] uitbraken) {
        this.zonecode = zonecode;
        this.naam = naam;
        this.uitbraken = new Uitbraak[10];
    }


    //extra
    public void voegUitbraakToe(Uitbraak uitbraak) {
        for (int i = 0; i < uitbraken.length; i++) {
            if (uitbraken[i] == null) {
                uitbraken[i] = uitbraak;
                return;
            }
            System.out.println("Array zit vol");
            return;
        }
    }
    

    public int geefPatientenPerUitbraak(String identificatiecode) {
        try {
            for (int i = 0; i < uitbraken.length; i++) {
                if (uitbraken[i].getIdentificatiecode() == identificatiecode) {
                    return uitbraken[i].getAantalPatienten();
                }
            }
            throw new UitbraakNietGevondenException("Uitbraak is niet gevonden");
        } catch (UitbraakNietGevondenException e) {
            return e.getMessage();
        }
    }

    public void archiveerZoneData() {
        try (FileOutputStream fileoutput = new FileOutputStream("./Examen/Deel_3/ZoneData.data");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileoutput)) {
            outputStream.writeObject(outputStream);
        } catch (Exception e) {}
    }
}


