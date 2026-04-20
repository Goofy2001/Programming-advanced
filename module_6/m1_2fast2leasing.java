package module_6;

import java.util.TreeMap;

class Wagen {
    private int serienummer;
    private int zitplaatsen;
    private String brandstoftype;
    private boolean verhuurd;

    public Wagen(int serienummer, int zitplaatsen, String brandstoftype, boolean verhuurd) {
        this.serienummer = serienummer;
        this.zitplaatsen = zitplaatsen;
        this.brandstoftype = brandstoftype;
        this.verhuurd = verhuurd;
    }

    public boolean verhuur() {
        if (verhuurd) {
            return false;
        }
        verhuurd = true;
        return true;
    }

    public boolean terugbrengen() {
        if (!verhuurd) {
            return false;
        }
        verhuurd = false;
        return true;
    }

    @Override
    public String toString() {
        return "Wagen " + serienummer + " - " + brandstoftype + " - " + zitplaatsen + " plaatsen";
    }
}

class Collection {
    private TreeMap<String, Wagen> auto;

    public Collection() {
        this.auto = new TreeMap<>();
    }

    public boolean voegWagenToe(String nummerplaat, Wagen wagen) {
        if (nummerplaat == null || wagen == null) {
            return false;
        }
        if (auto.containsKey(nummerplaat)) {
            return false;
        }
        auto.put(nummerplaat, wagen);
        return true;
    }

    public Wagen zoekWagenOpNummerplaat(String nummerplaat) {
        return auto.get(nummerplaat);
    }

    public boolean verhuurWagen(String nummerplaat) {
        Wagen wagen = auto.get(nummerplaat);
        if (wagen == null) {
            return false;
        }
        return wagen.verhuur();
    }

    public boolean brengWagenTerug(String nummerplaat) {
        Wagen wagen = auto.get(nummerplaat);
        if (wagen == null) {
            return false;
        }
        return wagen.terugbrengen();
    }
}
