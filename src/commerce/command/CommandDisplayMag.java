package commerce.command;

import commerce.Item;
import commerce.Magasin;

public class CommandDisplayMag implements Command {

    private Magasin mag;

    public CommandDisplayMag(Magasin mag) {
        this.mag = mag;
    }

    @Override
    public void execute() {

        for (Item i : mag.getStock().keySet()) {
            System.out.println(i.displayItem() + ", Quantité : " + mag.getStock().get(i));
        }
        System.out.println(mag.getNom() + " a un capital de " + mag.getCapital() + " €");
    }


}

