import Brood_memes.Brood;
import Brood_memes.Krentenbrood;
import Brood_memes.Sesambrood;
import Brood_memes.Witbrood;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Bakker bakker = new Bakker();
        bakker.maakKrentenbrood("verpakt", 75);
        bakker.maakKrentenbrood("niet verpakt", 5);
        bakker.maakSesambrood("verpakt", 2);
        bakker.maakWitbrood("niet verpakt", 90);

        bakker.printBroodLijst();
    }

}
