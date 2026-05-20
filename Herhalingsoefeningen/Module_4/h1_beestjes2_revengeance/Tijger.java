package Herhalingsoefeningen.Module_4.h1_beestjes2_revengeance;

import java.time.LocalDate;

public class Tijger extends Zoogdier {
    //fields
    //constructor
    public Tijger(LocalDate d) {
        super(d);
    }
    //extra
    @Override
    public String maakGeluid() {
        return "Grrrrr";
    }
}
