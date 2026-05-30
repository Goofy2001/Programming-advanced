package Examen.Deel_1;

public class ViraleUitbraak extends Uitbraak {
    //fields
    private Verspreidingstype type;
    //constructor
    public ViraleUitbraak(String identificatiecode, int aantalPatienten, Verspreidingstype type) {
        super(identificatiecode, aantalPatienten);
        this.type = type;
    }

    //getter
    @Override
    public String getIdentificatiecode() {
        return super.getIdentificatiecode();
    }
}
