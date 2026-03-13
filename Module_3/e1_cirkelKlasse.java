package Module_3;

public class e1_cirkelKlasse {
    
    private float straal;
    private String kleur;

    public e1_cirkelKlasse(float straal) {
        this.straal = straal;
        this.kleur = "wit";
    }

    public e1_cirkelKlasse(String kleur) {
        this.straal = 0;
        this.kleur = kleur;
    }
    
    public e1_cirkelKlasse() {
        this.straal = 0;
        this.kleur = "wit";
    }

    public void print() {
        System.out.println("straal="+this.straal+"; kleur="+this.kleur);
    }

    public void geefOmtrek() {
        System.out.println(2*Math.PI*this.straal);
    }

    public void geefOppervlakte() {
        System.out.println(Math.PI*this.straal*this.straal);
    }

    public static void main(String[] args) {
        e1_cirkelKlasse kleineCirkel = new e1_cirkelKlasse(20);
        kleineCirkel.print();
        kleineCirkel.geefOppervlakte();
    }
}


