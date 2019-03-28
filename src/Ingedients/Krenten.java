package Ingedients;

public class Krenten implements IngedientBehaviour {
    private final String INGEDIENT = "krenten";
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
