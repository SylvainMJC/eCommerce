package commerce.commands;

import commerce.domain.Item;
import commerce.domain.Magasin;
import commerce.io.*;

import java.util.Scanner;

public class CommandAddItem implements Command {

    private Magasin mag;

    public CommandAddItem(Magasin mag) {
        this.mag = mag;
    }

    @Override
    public void execute() {
        boolean res = false;

        Scanner s = new Scanner(System.in);
        String input;


        String label = LabelHandler.execute();
        String ref = ReferenceHandler.execute();
        float price = PriceHandler.execute();
        int qte = QuantityHandler.execute();


        Item i = new Item(price, label, ref);
        res = mag.addItem(i, qte);

        if(res){
            MessageHandler.execute(MessageEnum.ITEM_ADD_SUCCESS);
        }else{
            MessageHandler.execute(MessageEnum.ITEM_ADD_FAILURE);
        }

    }
}
