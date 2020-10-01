package commerce.io;

import java.util.Scanner;

public class ReferenceHandler {

    public static String execute(){

        Scanner s = new Scanner(System.in);

        MessageHandler.execute(MessageEnum.SPECIFY_REFERENCE);
        String res = s.nextLine();

        if(res != null){
            return res;
        }else{
            MessageHandler.execute(MessageEnum.INVALID_ENTRY);
        }


    }

}
