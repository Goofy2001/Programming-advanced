package module_6;

import java.util.HashSet;


class Werknemer {
    private String naam;
    private HashSet <String> skills;

    //constructor
    public Werknemer(String naam) {
        this.naam = naam;
        this.skills = new HashSet<>();
    }

    //getter
    public void getNaam() {
        System.out.println(this.naam);
    }

    public void getSkills() {
        System.out.println(this.skills);
    }

    //setter (kinda)
    public boolean addSkill(String skill) {
        return this.skills.add(skill);
    }

    public boolean deleteSkill(String skill) {
        return this.skills.remove(skill);
    }

    //main
    public static void main(String[] args) {
        Werknemer werknemer1 = new Werknemer("John");

        werknemer1.getNaam();
        werknemer1.getSkills();
        System.out.println(werknemer1.addSkill("FME"));
        System.out.println(werknemer1.addSkill("FME"));
        werknemer1.getSkills();
        werknemer1.deleteSkill("FME");
        werknemer1.getSkills();
    }
}

