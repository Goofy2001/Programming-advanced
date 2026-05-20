package Herhalingsoefeningen.Module_4.h1_beestjes2_revengeance;

import java.time.LocalDate;

public class Pinguin extends Zoogdier implements KanZwemmen {
    //field
    //constructor
    public Pinguin(LocalDate d) {
        super(d);
    }

    //extra
    @Override
    public String maakGeluid() {
        return "Honk honk";
    }
    @Override
    public String zwem() {
        return "De pinguin zwemt";
    }
}
