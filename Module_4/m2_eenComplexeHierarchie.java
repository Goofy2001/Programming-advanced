package Module_4;

class Persoon {
    // variables
    private String voornaam;
    private String achternaam;

    // constructor
    public Persoon(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        System.out.println("Nieuwe persoon aangemaakt");
    }

    // getters
    public String getVoornaam() {
        return this.voornaam;
    }

    public String getAchternaam() {
        return this.achternaam;
    }
}

class Student extends Persoon {
    // variables
    private int studentennummer;
    private String specialisatie;

    // constructor
    public Student(String voornaam, String achternaam, int studentennummer, String specialisatie) {
        super(voornaam, achternaam);
        this.studentennummer = studentennummer;
        this.specialisatie = specialisatie;
    }

    // getters
    public int getStudentennummer() {
        return this.studentennummer;
    }

    public String getSpecialisatie() {
        return this.specialisatie;
    }

    // toString
    public void print() {
        System.out.println(this.getVoornaam() + " " + this.getAchternaam() + " (Student nr: " + this.studentennummer + ", Spec: " + this.specialisatie + ")");
    }
}

class Lokaal {
    // variables
    private String adres;
    private String gebouw;
    private int verdieping;
    private String lokaalnummer;

    // constructor
    public Lokaal(String adres, String gebouw, int verdieping, String lokaalnummer) {
        this.adres = adres;
        this.gebouw = gebouw;
        this.verdieping = verdieping;
        this.lokaalnummer = lokaalnummer;
    }

    // getters
    public String getAdres() {
        return this.adres;
    }

    public String getGebouw() {
        return this.gebouw;
    }

    public int getVerdieping() {
        return this.verdieping;
    }

    public String getLokaalnummer() {
        return this.lokaalnummer;
    }

    // setters
    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setGebouw(String gebouw) {
        this.gebouw = gebouw;
    }

    public void setVerdieping(int verdieping) {
        this.verdieping = verdieping;
    }

    public void setLokaalnummer(String lokaalnummer) {
        this.lokaalnummer = lokaalnummer;
    }

    // toString
    public void print() {
        System.out.println("  Lokaal: " + this.lokaalnummer + ", Gebouw: " + this.gebouw + ", Verdieping: " + this.verdieping + ", Adres: " + this.adres);
    }
}

class Personeelslid extends Persoon {
    // variables
    private Lokaal lokaal;

    // constructor
    public Personeelslid(String voornaam, String achternaam, Lokaal lokaal) {
        super(voornaam, achternaam);
        this.lokaal = lokaal;
    }

    // getters
    public Lokaal getLokaal() {
        return this.lokaal;
    }

    // setters
    void setLokaal(Lokaal lokaal) {
        this.lokaal = lokaal;
    }

    // toString
    public void print() {
        System.out.println(this.getVoornaam() + " " + this.getAchternaam() + " (Personeelslid)");
        this.lokaal.print();
    }
}

class Docent extends Personeelslid {
    // variables
    private String specialisatie;
    private Student[] studenten;
    private int aantalStudenten;

    // constructor
    public Docent(String voornaam, String achternaam, Lokaal lokaal, String specialisatie) {
        super(voornaam, achternaam, lokaal);
        this.specialisatie = specialisatie;
        this.studenten = new Student[50]; // max 50 studenten
        this.aantalStudenten = 0;
    }

    // getters
    public String getSpecialisatie() {
        return this.specialisatie;
    }

    // add student
    public void voegStudentToe(Student student) {
        if (this.aantalStudenten < this.studenten.length) {
            this.studenten[this.aantalStudenten] = student;
            this.aantalStudenten++;
            System.out.println(student.getVoornaam() + " is toegevoegd aan docent " + this.getVoornaam());
        } else {
            System.out.println("Maximaal aantal studenten bereikt");
        }
    }

    // get all students
    public void printStudenten() {
        System.out.println("Docent " + this.getVoornaam() + " (" + this.specialisatie + ") begeleidt:");
        for (int i = 0; i < this.aantalStudenten; i++) {
            System.out.print("  - ");
            this.studenten[i].print();
        }
    }

    // toString
    @Override
    public void print() {
        System.out.println(this.getVoornaam() + " " + this.getAchternaam() + " (Docent, Spec: " + this.specialisatie + ")");
        this.getLokaal().print();
    }
}

class Bediende extends Personeelslid {
    // variables (none extra needed yet)

    // constructor
    public Bediende(String voornaam, String achternaam, Lokaal lokaal) {
        super(voornaam, achternaam, lokaal);
    }

    // package-private method: wijzig lokaal van ander personeelslid
    void wijzigLokaalVan(Personeelslid personeelslid, Lokaal nieuwLokaal) {
        personeelslid.setLokaal(nieuwLokaal);
        System.out.println(this.getVoornaam() + " (bediende) heeft het lokaal van " + personeelslid.getVoornaam() + " gewijzigd");
    }

    // toString
    @Override
    public void print() {
        System.out.println(this.getVoornaam() + " " + this.getAchternaam() + " (Bediende)");
        this.getLokaal().print();
    }
}

public class m2_eenComplexeHierarchie {
    public static void main(String[] args) {
        // creëer lokalen
        Lokaal lokaal1 = new Lokaal("Nijverheidskaai 170", "Blok A", 2, "A201");
        Lokaal lokaal2 = new Lokaal("Nijverheidskaai 170", "Blok B", 1, "B105");
        Lokaal lokaal3 = new Lokaal("Nijverheidskaai 170", "Blok C", 3, "C301");

        // creëer personen
        Student student1 = new Student("Jan", "Peeters", 20001, "TI");
        Student student2 = new Student("Marie", "De Smet", 20002, "MCT");
        Student student3 = new Student("Kris", "Verhoeven", 20003, "TI");

        Docent docent1 = new Docent("Anna", "Janssen", lokaal1, "TI");
        Docent docent2 = new Docent("Peter", "Claes", lokaal2, "MCT");
        Bediende bediende1 = new Bediende("Tom", "Raes", lokaal3);

        // voeg studenten toe aan docenten
        docent1.voegStudentToe(student1);
        docent1.voegStudentToe(student3);
        docent2.voegStudentToe(student2);

        System.out.println("\n=== Overzicht Personen ===\n");

        // print iedereen
        docent1.print();
        docent1.printStudenten();

        System.out.println();
        docent2.print();
        docent2.printStudenten();

        System.out.println();
        bediende1.print();

        // test: bediende wijzigt lokaal van docent
        System.out.println("\n=== Test: Lokaalwijziging ===\n");
        Lokaal nieuwLokaal = new Lokaal("Nijverheidskaai 170", "Blok D", 4, "D402");
        bediende1.wijzigLokaalVan(docent1, nieuwLokaal);

        System.out.println("\nDocent na wijziging:");
        docent1.print();
    }
}
