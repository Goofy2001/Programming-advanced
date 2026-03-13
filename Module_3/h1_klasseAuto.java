package Module_3;

class Auto {
    
    private double kilometerteller;
    private double inhoud;
    private double verbruik;

    public Auto(double kilometerteller, double inhoud, double verbruik) {
        this.kilometerteller = kilometerteller;
        this.inhoud = inhoud;
        this.verbruik = verbruik;
    }

    public Auto(double verbruik) {
        this.kilometerteller = 0;
        this.inhoud = 0;
        this.verbruik = verbruik;
    }

    public void tanken(double tankbeurt) {
        this.inhoud += tankbeurt;
    }

    public double rijden(double afstand) {
        if (this.inhoud/this.verbruik >= Math.abs(afstand)) {
            this.kilometerteller += Math.abs(afstand);
            this.inhoud -= this.verbruik*Math.abs(afstand);
            return Math.abs(afstand);
        } else {
            double maxAfstand = this.inhoud/this.verbruik;
            this.kilometerteller += maxAfstand;
            this.inhoud = 0;
            return maxAfstand;
        }
    }

    public void print() {
        System.out.println("Aantal kilometers: "+this.kilometerteller+"; Inhoud: " + this.inhoud + " ; Verbruik: " + this.verbruik);
    }

    public static void main(String[] args) {
        Auto McLaren = new Auto(100,20,5);
        McLaren.print();
        double afstand = McLaren.rijden(100);
        System.out.println(afstand);
        McLaren.print();
        McLaren.tanken(500);
        McLaren.print();
        McLaren.rijden(100);
        McLaren.print();
    }
}
