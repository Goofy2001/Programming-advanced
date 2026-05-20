package Herhalingsoefeningen.Module_4.h1_beestjes2_revengeance;

/* We gaan hier dieper in op overerving, wat volgt is een complexere hiërarchie waarmee we verschillende dieren gaan voorstellen, een schema opstellen hoe alles in elkaar past helpt enorm.
Start met een klasse Dier, deze klasse bevat een geboortedatum, een toString methode en een methode maakGeluid, maakGeluid geeft tekst terug met het geluid dat een dier maakt.
maakGeluid is hier nog te abstract om op te vullen, dit zal in de subklassen moeten gebeuren. */

import java.time.LocalDate;

public abstract class Dier {
    //field
    private LocalDate geboortedatum;
    //constructor
    public Dier(LocalDate datum) {
        this.geboortedatum = datum;
    }
    //extra
    @Override
    public String toString() {
        return "Geboortedatum: " + geboortedatum;
    }

    public abstract String maakGeluid();
}
