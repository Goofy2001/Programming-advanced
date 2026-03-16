package Module_4;

import Module_3.e1_cirkelKlasse;

class Zwembad extends e1_cirkelKlasse{
    
    private double breedte;
    private double padPrijs;
    private double omheiningPrijs;

    public Zwembad(double straal, double breedte, double padPrijs, double omheiningPrijs) {
        super(straal);
        this.breedte = breedte;
        this.padPrijs = padPrijs;
        this.omheiningPrijs = omheiningPrijs;
    }

    public double prijsPad() {
        return (geefOppervlakte(this.getStraal() + this.breedte) - geefOppervlakte(this.getStraal()))*this.padPrijs;
    }

    public double prijsOmheining() {
        return (this.getStraal() * this.omheiningPrijs);
    }

    public double prijsTotaal() {
        return prijsPad() + prijsOmheining();
    }

    public static void main(String[] args) {
        Zwembad z1 = new Zwembad(50, 2, 49.99, 89.99);

        System.out.println(z1.prijsPad());
        System.out.println(z1.prijsOmheining());
        System.out.println(z1.prijsTotaal());


    }

    
}
