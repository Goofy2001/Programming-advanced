package Herhalingsoefeningen.Module_4.m2_eenComplexereHierarchie;

public class Docent extends Bediende {
    //fields
    private String specialisatie;
    private Student[] students;

    //constructor
    public Docent(Lokaal lokaal, String voornaam, String achternaam, String specialisatie) {
        super(lokaal, voornaam, achternaam);
        this.specialisatie = specialisatie;
        students = new Student[100];
    }

    //extra
    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
        System.out.println("Array is te klein");
    }
}
