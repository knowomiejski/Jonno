import Brood_memes.Brood;
import Ingedients.Krenten;
import Ingedients.Melk;
import Ingedients.Sesam;
import Verpakking.Verpakt;

import java.util.ArrayList;

public class Bakker {
    private ArrayList<Brood> broodlijst = new ArrayList<>();

    public void maakWitbrood(int hoeveelheid) {
        Brood witbrood = new Brood();
        witbrood.setIngedientBehaviour(new Melk());
        witbrood.setVerpakkingBehaviour(new Verpakt());
        witbrood.setHoeveelheid(hoeveelheid);
        broodlijst.add(witbrood);
    }

    public void maakSesambrood(int hoeveelheid) {
        Brood sesambrood = new Brood();
        sesambrood.setIngedientBehaviour(new Sesam());
        sesambrood.setVerpakkingBehaviour(new Verpakt());
        sesambrood.setHoeveelheid(hoeveelheid);
        broodlijst.add(sesambrood);
    }

    public void maakKrentenbrood(int hoeveelheid) {
        Brood krentenbrood = new Brood();
        krentenbrood.setIngedientBehaviour(new Krenten());
        krentenbrood.setVerpakkingBehaviour(new Verpakt());
        krentenbrood.setHoeveelheid(hoeveelheid);
        broodlijst.add(krentenbrood);
    }

    public void printBroodLijst() {
        for (Brood brood: broodlijst) {
            System.out.println("Specificaties: dit " + brood.doNaam() + " is " + brood.doVerpakking() + " en bevat " + brood.getHoeveelheid() + " " + brood.doIngedient());
        }
    }
}
