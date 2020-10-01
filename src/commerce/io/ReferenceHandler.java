package commerce.io;

import java.util.Scanner;

public class ReferenceHandler {

    public static String execute(){

        Scanner s = new Scanner(System.in);

        MessageHandler.execute(MessageEnum.SPECIFY_REFERENCE);
        //String res = s.nextLine();

        String input = null;
        do {

            try {

                input = s.nextLine();

            }
            catch(Exception e){
                MessageHandler.execute(MessageEnum.INVALID_REFERENCE);
                s.nextLine();
            }

        }while(input.isEmpty());

        return input;
        /*if(res != null){
            return res;
        }else{
            MessageHandler.execute(MessageEnum.INVALID_ENTRY);
        }*/


    }

}
