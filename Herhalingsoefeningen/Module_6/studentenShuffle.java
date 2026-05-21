package Herhalingsoefeningen.Module_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import Herhalingsoefeningen.Module_4.m2_eenComplexereHierarchie.Student;


public class studentenShuffle {
    public static void main(String[] args) {
        List<Student> studentenlijst = new ArrayList<>();
        Student student1 = new Student("Thibo", "Coudron", "1323465", "ICT");
        Student student2 = new Student("Bob", "Baker", "specials", "specials");
        Student student3 = new Student("Maria", "Julia", "79889879", "Specialty");
        //add students
        studentenlijst.add(student1);
        studentenlijst.add(student2);
        studentenlijst.add(student3);
        for (Student student : studentenlijst) {
            System.out.print(student.getVoornaam() + ", ");
        };
        //shuffle
        Collections.shuffle(studentenlijst);
        for (Student student : studentenlijst) {
            System.out.print(student.getVoornaam() + ", ");
        }
    }
}
