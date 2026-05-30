package Examen.Deel_3;

import Examen.Deel_1.BacterieleUitbraak;
import Examen.Deel_1.Uitbraak;
import Examen.Deel_1.Verspreidingstype;
import Examen.Deel_1.ViraleUitbraak;

public class main {
    public static void main(String[] args) {
        ViraleUitbraak viraal = new ViraleUitbraak("123abc",12,Verspreidingstype.AEROSOL);
        BacterieleUitbraak bacterieel1 = new BacterieleUitbraak("456efg",44,13);
        BacterieleUitbraak bacterieel2 = new BacterieleUitbraak("456efg",44,14);
        Uitbraak[] testUitbraken = new Uitbraak[10];
        testUitbraken[0] = viraal;
        testUitbraken[1] = bacterieel1;
        
        MonitoringsZone zone = new MonitoringsZone("Bolivia","Hantavirus", testUitbraken);
        zone.voegUitbraakToe(bacterieel2);

        zone.archiveerZoneData();

        
    }
}
