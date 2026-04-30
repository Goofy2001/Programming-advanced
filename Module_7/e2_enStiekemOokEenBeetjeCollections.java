package Module_7;

class OntoereikendSaldo extends Exception {
    public OntoereikendSaldo() {
        super("Ontoereikend saldo op de rekening");
    }
}

class BankRekening {

    private double bedrag;

    public BankRekening() {
        this.bedrag = 0;
    }

    public BankRekening(double bedrag) {
        if (bedrag < 0) {
            this.bedrag = 0;
        } else {
            this.bedrag = bedrag;
        }
    }
    
    public void getSaldo() {
        System.out.println(this.bedrag);
    }

    private void setSaldo(double saldo) {
        this.bedrag += saldo;
    }

    public void storten(double bedrag) {
        if (bedrag <= 0) {
            System.out.println("Positief getal nodig");
        } else {
            this.setSaldo(bedrag);
        }
    }

    public void afhaling(double bedrag) throws OntoereikendSaldo {
        if (bedrag <= 0) {
            System.out.println("Positief getal nodig");
        } else {
            if (this.bedrag < bedrag) {
                throw new OntoereikendSaldo();
            } else {
                this.setSaldo(-bedrag);
            }
        }
    }
}

class BankRekeningTest {
    public static void main(String[] args) {
        BankRekening rekening = new BankRekening(50);

        rekening.getSaldo();

        try {
            rekening.afhaling(75);
        } catch (OntoereikendSaldo e) {
            System.out.println(e.getMessage());
        }

        rekening.storten(25);
        rekening.getSaldo();
    }
}