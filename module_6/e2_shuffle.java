package module_6;

import java.util.ArrayList;
import java.util.Collections;

class Lijst {
    private ArrayList<String> studenten;
    
    //constructor
    public Lijst() {
        this.studenten = new ArrayList<>();
    }

    //functies
    public void voegStudentToe(String naam) {
        this.studenten.add(naam);
    }

    public void shuffleLijst() {
        Collections.shuffle(studenten);
    }

    public void print() {
        System.out.println(this.studenten);
    }

    public static void main(String[] args) {
        Lijst lijst = new Lijst();

        lijst.voegStudentToe("Tim");
        lijst.voegStudentToe("John");
        lijst.voegStudentToe("abc");

        lijst.print();
        lijst.shuffleLijst();
        lijst.print();
    }
}
