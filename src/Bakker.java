import Brood_memes.Brood;
import Brood_memes.Krentenbrood;
import Brood_memes.Sesambrood;
import Brood_memes.Witbrood;

import java.util.ArrayList;

public class Bakker {
    private ArrayList<Brood> broodlijst = new ArrayList<>();

    public void maakWitbrood(String verpakking, int hoeveelheidIngedienten) {
        Brood witbrood = new Witbrood(hoeveelheidIngedienten);
        witbrood.setVerpakking(verpakking);
        broodlijst.add(witbrood);
    }

    public void maakSesambrood(String verpakking, int hoeveelheidIngedienten) {
        Brood sesambrood = new Sesambrood(hoeveelheidIngedienten);
        sesambrood.setVerpakking(verpakking);
        broodlijst.add(sesambrood);
    }

    public void maakKrentenbrood(String verpakking, int hoeveelheidIngedienten) {
        Brood krentenbrood = new Krentenbrood(hoeveelheidIngedienten);
        krentenbrood.setVerpakking(verpakking);
        broodlijst.add(krentenbrood);
    }

    public void printBroodLijst() {
        for (Brood brood: broodlijst) {
            System.out.println("Specificaties: dit " + brood.getNaam() + " is " + brood.getVerpakking() + " en bevat " + brood.getHoeveelheid() + " " + brood.getIngedient());
        }
    }
}
