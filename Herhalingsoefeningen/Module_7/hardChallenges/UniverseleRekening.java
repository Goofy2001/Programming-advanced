package Herhalingsoefeningen.Module_7.hardChallenges;

import java.util.TreeSet;

import Herhalingsoefeningen.Module_3.BankRekening;

public class UniverseleRekening extends BankRekening{
    //field
    private TreeSet<String> volmachthebbers;
    //constructor
    public UniverseleRekening(double bedrag) {
        super(bedrag);
        this.volmachthebbers = new TreeSet<String>();
    }

    //extra
    public void afhalen(double bedrag, String persoon) {
        try {
            if (controleerVolmacht(persoon)) {
                super.afhalen(bedrag);
            } else {
                throw new PersoonHeeftGeenVolmachtException("De persoon heeft geen volmacht tot deze rekening");
            }
        } catch (PersoonHeeftGeenVolmachtException e) {
            System.out.println(e.getMessage());
        }
        
    }

    public void toevoegenVolmacht(String persoon) {
        this.volmachthebbers.add(persoon);
    }

    public void verwijderenVolmacht(String persoon) {
        this.volmachthebbers.remove(persoon);
    }

    public boolean controleerVolmacht(String persoon) {
        if (this.volmachthebbers.contains(persoon)) {
            return true;
        } else {
            return false;
        }
    }

    public TreeSet<String> toonVolmachthebbers() {
        return this.volmachthebbers;
    }
}
