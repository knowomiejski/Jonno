package Verpakking;

public class NietVerpakt implements VerpakkingBehaviour{
    private final String VERPAKKING = "verpakt";

    @Override
    public String getVerpakking() {
        return VERPAKKING;
    }
}
