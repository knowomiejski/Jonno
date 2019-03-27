package Brood_memes;

public class Krentenbrood extends Brood{
    private String naam = "Krentenbrood";
    private String ingedient = "krenten";

    public Krentenbrood(int hoeveelheid) {
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
