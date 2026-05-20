package Herhalingsoefeningen.Module_4.h1_beestjes2_revengeance;

import java.time.LocalDate;

public class Eend extends Vogel implements KanVliegen, KanZwemmen {
    //fields
    //constructor
    public Eend(LocalDate d) {
        super(d);
    }
    //extra
    @Override
    public String maakGeluid() {
        return "Kwak kwak";
    }
    //interfaces
    public String vlieg() {
        return "De eend vliegt";
    }

    @Override
    public String zwem() {
        return "De eend zwemt";
    }
}
