class Zviera {
    public void zvuk() {
        System.out.println("Zviera vydáva zvuk");
    }
}

class Pes extends Zviera {
    @Override
    public void zvuk() {
        System.out.println("Pes šteká");
    }
}

public class PretypovanieReferencne {
    public static void main(String[] args) {
        Zviera zviera = new Pes(); // Implicitné pretypovanie (upcasting)
        zviera.zvuk(); // Vypíše: Pes šteká

        if (zviera instanceof Pes) {
            Pes pes = (Pes) zviera; // Explicitné pretypovanie (downcasting)
            pes.zvuk(); // Vypíše: Pes šteká
        }
    }
}
