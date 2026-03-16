package Module_4;

import Module_3.Adres;

class Person extends Adres {
    private String voornaam, achternaam, email;

    public Person(String voornaam, String achternaam, String straatnaam, int huisnummer, int postcode, String bus) {
        super(straatnaam, huisnummer, bus, postcode);
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    public String toString() {
        return "Voornaam: " + voornaam + "\nAchternaam: " + achternaam +"\nEmail: " + email + "\nAdres: "+ super.toString();
    }

}

class Main {
    public static void main(String[] args) {
        
        Person p1 = new Person("Goofy", "Goofert",
        "Dromenland", 67, 2020, "A");

        Person p2 = new Person("Mickey", "Mouse",
        "Dromenland", 55, 5050, "");

        System.out.print(p1.toString());
        System.out.println(p2);
    }
}
