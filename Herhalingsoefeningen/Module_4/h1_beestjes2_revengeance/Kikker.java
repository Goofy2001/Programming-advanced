package Herhalingsoefeningen.Module_4.h1_beestjes2_revengeance;

import java.time.LocalDate;

public class Kikker extends Amfibie implements KanZwemmen{
    //field
    //constructor
    public Kikker(LocalDate d) {
        super(d);
    }
    //extra
    @Override
    public String maakGeluid() {
        return "kwabab kwabab";
    }

    @Override
    public String zwem() {
        return "De kikker zwemt";
    }
}
