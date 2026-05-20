package Herhalingsoefeningen.Module_4.h1_beestjes2_revengeance;

import java.time.LocalDate;

public class Noordzeezalm extends Vis implements KanZwemmen{
    //field

    //constructor
    public Noordzeezalm(LocalDate geboortedatum) {
        super(geboortedatum);
    }

    //extra
    @Override
    public String maakGeluid() {
        return "blub blub...";
    }

    @Override
    public String zwem() {
        return "De zalm zwemt";
    }
}
