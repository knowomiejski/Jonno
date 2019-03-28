package Ingedients;

public class Sesam implements IngedientBehaviour {
    private final String INGEDIENT = "gram sesamzaad";
    private final String NAAM = "Sesambrood";



    @Override
    public String getIngedient() {
        return INGEDIENT;
    }

    @Override
    public String getNaam() {
        return NAAM;
    }
}
