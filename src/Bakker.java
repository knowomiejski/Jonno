import Brood_memes.Brood;
import Brood_memes.Krentenbrood;
import Brood_memes.Sesambrood;
import Brood_memes.Witbrood;
import Ingedients.Krenten;
import Ingedients.Melk;
import Ingedients.Sesam;
import Verpakking.Verpakt;

import java.util.ArrayList;

public class Bakker {
    private ArrayList<Brood> broodlijst = new ArrayList<>();

    public void maakWitbrood(int hoeveelheid) {
        Brood witbrood = new Witbrood();
        witbrood.setVerpakkingBehaviour(new Verpakt());
        witbrood.setHoeveelheid(hoeveelheid);
        broodlijst.add(witbrood);
    }

    public void maakSesambrood(int hoeveelheid) {
        Brood sesambrood = new Sesambrood();
        sesambrood.setVerpakkingBehaviour(new Verpakt());
        sesambrood.setHoeveelheid(hoeveelheid);
        broodlijst.add(sesambrood);
    }

    public void maakKrentenbrood(int hoeveelheid) {
        Brood krentenbrood = new Krentenbrood();
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
