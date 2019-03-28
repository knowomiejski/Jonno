package Ingedients;

public class Melk implements IngedientBehaviour {
    private final String INGEDIENT = "milliliter melk";
    private final String NAAM = "Krentenbrood";

    @Override
    public String getIngedient() {
        return INGEDIENT;
    }

    @Override
    public String getNaam() {
        return NAAM;
    }
}
