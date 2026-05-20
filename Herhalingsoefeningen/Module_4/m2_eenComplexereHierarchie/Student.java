package Herhalingsoefeningen.Module_4.m2_eenComplexereHierarchie;

public class Student extends Persoon {
    //fields
    private String studentennummer;
    private String specialisatie;

    //constructor
    public Student(String voornaam, String achternaam, String studentennummer, String specialisatie) {
        super(voornaam, achternaam);
        this.studentennummer = studentennummer;
        this.specialisatie = specialisatie;
    }

    public Student(Persoon persoon, String studentennummer, String specialisatie) {
        super(persoon.getVoornaam(), persoon.getAchternaam());
        this.studentennummer = studentennummer;
        this.specialisatie = specialisatie;
    }

    //extra
    @Override
    public String toString() {
        return super.toString() + " is een student (" + studentennummer + ") en is gespecialiseerd in: " + specialisatie;
    }

    public static void main(String[] args) {
        Persoon ThiboPersoon = new Persoon("Thibo", "Coudron");
        Student ThiboStudent = new Student(ThiboPersoon, "012345", "Full-Stack Development");

        System.out.println(ThiboStudent.toString());
    }
}
