package Herhalingsoefeningen.Module_6;

import java.util.HashSet;

public class Werknemer {
    // field
    private String naam;
    private HashSet<String> skills;

    // constructor
    public Werknemer(String naam) {
        this.naam = naam;
        this.skills = new HashSet<>();
    }

    // extra
    public boolean addSkill(String skill) {
        return this.skills.add(skill);
    }

    public boolean deleteSkill(String skill) {
        return this.skills.remove(skill);
    }

    @Override
    public String toString() {
        return naam + " heeft skills: " + skills;
    }

    public static void main(String[] args) {
        Werknemer w = new Werknemer("Thibo");

        System.out.println(w.addSkill("Glasvezel")); // true
        System.out.println(w.addSkill("Glasvezel")); // false (bestond al)
        System.out.println(w.addSkill("Big Data")); // true

        System.out.println(w.deleteSkill("Elektriciteit")); // false
        System.out.println(w.deleteSkill("Big Data")); // true

        System.out.println(w);
    }
}
