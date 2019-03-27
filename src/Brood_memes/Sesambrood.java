package Brood_memes;

public class Sesambrood extends Brood {
    private String naam = "Sesambrood";
    private String ingedient = "gram sesamzaad";

    public Sesambrood(int hoeveelheid) {
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
