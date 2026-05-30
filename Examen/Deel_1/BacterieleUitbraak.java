package Examen.Deel_1;

public class BacterieleUitbraak extends Uitbraak {
    //fields
    private int incubatietijd;
    //constructor
    public BacterieleUitbraak(String identificatiecode, int aantalPatienten, int incubatietijd) {
        super(identificatiecode, aantalPatienten);
        this.incubatietijd = incubatietijd;
    }
    //getter
    @Override
    public int getAantalPatienten() {
        return super.getAantalPatienten();
    }

    @Override
    public String getIdentificatiecode() {
        return super.getIdentificatiecode();
    }

    
}
