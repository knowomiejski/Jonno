package Brood_memes;

import Ingedients.IngedientBehaviour;
import Verpakking.VerpakkingBehaviour;

public class Brood {

    private IngedientBehaviour ingedientBehaviour;
    private VerpakkingBehaviour verpakkingBehaviour;
    private int hoeveelheid;

    public Brood() {
    }

    public void setIngedientBehaviour(IngedientBehaviour ingedientBehaviour) {
        this.ingedientBehaviour = ingedientBehaviour;
    }

    public void setHoeveelheid(int hoeveelheid) {
        this.hoeveelheid = hoeveelheid;
    }

    public int getHoeveelheid() {
        return hoeveelheid;
    }

    public void setVerpakkingBehaviour(VerpakkingBehaviour verpakkingBehaviour) {
        this.verpakkingBehaviour = verpakkingBehaviour;
    }

    public String doIngedient() {
        return ingedientBehaviour.getIngedient();
    }

    public String doNaam() {
        return ingedientBehaviour.getNaam();
    }

    public String doVerpakking() {
        return verpakkingBehaviour.getVerpakking();
    }
}
