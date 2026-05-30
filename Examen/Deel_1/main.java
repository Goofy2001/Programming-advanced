package Examen.Deel_1;

public class main {
    public static void main(String[] args) {

        ViraleUitbraak viraal = new ViraleUitbraak("123abc",12,Verspreidingstype.AEROSOL);

        BacterieleUitbraak bacterieel1 = new BacterieleUitbraak("456efg",44,13);
        BacterieleUitbraak bacterieel2 = new BacterieleUitbraak("456efg",44,14);

        System.out.println(bacterieel1.equals(bacterieel2));

        
        
    }
}
