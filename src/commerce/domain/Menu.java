package commerce.domain;

import commerce.commands.CommandRouter;
import commerce.io.MenuHandler;
import commerce.commands.CommandEnum;

public class Menu {

    private Magasin mag;

    public void startMenu(Magasin mag){



        this.mag = mag;
        System.out.println("Bienvenue dans " + mag.getNom());

        CommandEnum cmd = null;

        do{
            cmd = MenuHandler.execute();
            CommandRouter.execute(cmd,mag);


        }while(cmd != CommandEnum.EXIT);


    }
}
