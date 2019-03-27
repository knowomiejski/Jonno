package Brood_memes;

public class Witbrood extends Brood {
    private String naam = "Witbrood";
    private String ingedient = "centiliter melk";

    public Witbrood(int hoeveelheid) {
        super(hoeveelheid);
    }

    @Override
    public String getNaam() {
        return naam;
    }

    @Override
    public String getIngedient() {
        return ingedient;
    }
}
