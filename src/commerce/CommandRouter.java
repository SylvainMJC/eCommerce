package commerce;


import commerce.command.CommandAddItem;
import commerce.command.CommandDisplayMag;
import commerce.command.CommandEnum;
import commerce.command.CommandSellItem;
import commerce.io.MessageEnum;
import commerce.io.MessageHandler;

public class CommandRouter {

    public static void execute(CommandEnum cmd, Magasin mag){


            switch (cmd) {
                case ADD:
                    new CommandAddItem(mag).execute();
                    break;
                case SELL:
                    new CommandSellItem(mag).execute();
                    break;
                case DISPLAY:
                    new CommandDisplayMag(mag).execute();
                    break;
                case EXIT:
                    break;
                case INVALID:
                    MessageHandler.execute(MessageEnum.INVALID_ENTRY);
                    break;
            }
    }

}
