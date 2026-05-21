package Herhalingsoefeningen.Module_6.m1_2fast2leasing;

public class Wagen {
    //fields
    private String serienummer;
    private String brandstoftype;
    private int zitplaatsen;
    private boolean verhuurd;
    //constructor
    public Wagen(String serienummer, String brandstoftype, int zitplaatsen) {
        this.serienummer = serienummer;
        this.brandstoftype = brandstoftype;
        this.zitplaatsen = zitplaatsen;
        this.verhuurd = false;
    }

    //extra
    public boolean verhuur() {
        if (!verhuurd) {
            this.verhuurd = true;
            return true;
        }
        return false;
    }

    public boolean brengTerug() {
        if (verhuurd) {
            this.verhuurd = false;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.serienummer + " | " + this.brandstoftype + " | " + this.zitplaatsen + " | " + this.verhuurd;
    }
}
