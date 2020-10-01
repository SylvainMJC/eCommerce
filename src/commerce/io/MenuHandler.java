package commerce.io;


import commerce.commands.CommandEnum;

import java.util.Scanner;

public class MenuHandler {

    public static CommandEnum execute(){


        Scanner s = new Scanner(System.in);

        System.out.println("Display, Sell, Add ?");
        String input = s.nextLine();

        CommandEnum enumInput = CommandEnum.INVALID;

        for(CommandEnum ce : CommandEnum.values()){

            if(ce.label.equals(input)){

                enumInput = ce;
                break;

            }

        }

        return enumInput;

    }

}
