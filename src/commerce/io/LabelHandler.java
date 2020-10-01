package commerce.io;

import java.util.Scanner;

public class LabelHandler {

    public static String execute(){

        Scanner s = new Scanner(System.in);

        MessageHandler.execute(MessageEnum.SPECIFY_LABEL);
        //String input = s.nextLine();

        String input = null;
        do {

            try {

                input = s.nextLine();

            }
            catch(Exception e){
                MessageHandler.execute(MessageEnum.INVALID_LABEL);
                s.nextLine();
            }

        }while(input.isEmpty());

        return input;



    }

}
