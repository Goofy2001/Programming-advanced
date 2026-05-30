package Examen.Deel_1;

public class ParasitaireUitbraak extends Uitbraak implements Meldbaar{
    //fields
    private String drager;
    //constructor
    public ParasitaireUitbraak(String identificatiecode, int aantalPatienten, String drager) {
        super(identificatiecode, aantalPatienten);
        this.drager = drager;
    }

    //getter
    @Override
    public String getIdentificatiecode() {
        return super.getIdentificatiecode();
    }

    //extra
    public void stuurAlert() {} //leeg gelaten
}
