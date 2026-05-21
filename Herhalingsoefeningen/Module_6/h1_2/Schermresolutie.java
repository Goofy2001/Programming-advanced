package Herhalingsoefeningen.Module_6.h1_2;

public enum Schermresolutie {
    Xlarge(960,720), Large(640,480), Normal(470,320), Small(426,320);

    //field
    private final int breedte;
    private final int hoogte;

    //constructor
    private Schermresolutie(int breedte, int hoogte) {
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    //getter
    public String getSchermresolutie() {
        return "Schermresolutie: " + this.breedte + "dp x " + this.hoogte + "dp";
    }
}
