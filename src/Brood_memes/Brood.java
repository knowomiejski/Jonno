package Brood_memes;

public class Brood {
    private String naam;
    // Standaard is het brood niet verpakt, dit kan je met de setter veranderen
    private String verpakking = "Niet verpakt";
    private String ingedient;
    private int hoeveelheid;

    public Brood(int hoeveelheid) {
        this.hoeveelheid = hoeveelheid;
    }

    public void setVerpakking(String verpakking) {
        this.verpakking = verpakking;
    }

    public String getNaam() {
        return naam;
    }

    public String getVerpakking() {
        return verpakking;
    }

    public String getIngedient() {
        return ingedient;
    }

    public int getHoeveelheid() {
        return hoeveelheid;
    }
}
