package commerce.commands;


import commerce.domain.Magasin;
import commerce.io.MessageEnum;
import commerce.io.MessageHandler;
import commerce.io.QuantityHandler;
import commerce.io.ReferenceHandler;

import java.util.Scanner;

public class CommandSellItem implements Command {

    private Magasin mag;

    public CommandSellItem(Magasin mag) {
        this.mag = mag;
    }

    @Override
    public void execute() {

        Scanner s = new Scanner(System.in);
        String input;

        String ref = ReferenceHandler.execute();

        int qte = QuantityHandler.execute();

        boolean res = mag.sellItem(ref, qte);

        if(res){
            MessageHandler.execute(MessageEnum.ITEM_SOLD_SUCCESS);
        }else{
            MessageHandler.execute(MessageEnum.ITEM_SOLD_FAILURE);
        }

    }
}
