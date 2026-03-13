package Module_3;

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

    public void afhaling(double bedrag) {
        if (bedrag <= 0) {
            System.out.println("Positief getal nodig");
        } else {
            if (this.bedrag - bedrag < -1000) {
                System.err.println("Error");
            } else {
                this.setSaldo(-bedrag);
            }
        }
    }
}
