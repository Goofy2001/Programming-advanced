package Herhalingsoefeningen.Module_4.h1_beestjes2_revengeance;

import java.time.LocalDate;

public class Vleermuis extends Zoogdier implements KanVliegen{
    //fields

    //constructor
    public Vleermuis(LocalDate geboortedatum) {
        super(geboortedatum);
    }

    //extra
    @Override
    public String maakGeluid() {
        return "flap flap";
    }

    @Override
    public String vlieg() {
        return "De vleermuis vliegt";
    }
}
