package Verpakking;

public class Verpakt implements VerpakkingBehaviour {
    private final String VERPAKKING = "niet verpakt";

    @Override
    public String getVerpakking() {
        return VERPAKKING;
    }
}
