package Module_3;

class Adres {

    private String straatnaam;
    private int huisnummer;
    private String bus;
    private int postcode;
    
    public Adres(String straatnaam, int huisnummer, String bus, int postcode) {
        if (9999 >= postcode && 1000 <= postcode) {
            this.straatnaam = straatnaam;
            this.huisnummer = huisnummer;
            this.bus = bus;
            this.postcode = postcode;
        } else {
            System.out.println("Not valid postcode");
        }
    }

    public void setStraatnaam(String straatnaam) {
        this.straatnaam = straatnaam;
    }

    public void getStraatnaam() {
        System.out.println("De straatnaam is: " + this.straatnaam);
    }

    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
    }

    public void getHuisnummer() {
        System.out.println("Het huisnummer is: " + this.huisnummer);
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public void getBus() {
        System.out.println("De bus is: " + this.bus);
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public void getPostcode() {
        System.out.println("De postcode is: " + this.postcode);
    }

    public void print() {
        System.out.println("Het volledige adres is: " + postcode+" "+straatnaam+" "+huisnummer+" "+bus);
    }

    public static void main(String[] args) {
        Adres Goofy2001 = new Adres("Street",55,"A",1000);

        Goofy2001.print();
        Goofy2001.setPostcode(1010);
        Goofy2001.getPostcode();
    }
}
