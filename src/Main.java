
public class Main {

    public static void main(String[] args) {
        Bakker bakker = new Bakker();
        bakker.maakKrentenbrood(75);
        bakker.maakKrentenbrood(5);
        bakker.maakSesambrood(2);
        bakker.maakWitbrood(90);

        bakker.printBroodLijst();
    }
}
