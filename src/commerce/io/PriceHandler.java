package commerce.io;

import java.util.Scanner;

public class PriceHandler {

    public static float execute(){

        Scanner s = new Scanner(System.in);

        MessageHandler.execute(MessageEnum.SPECIFY_PRICE);

        float input = 0;

        do {

            try {

                input = s.nextFloat();

                if(input < 1){

                    MessageHandler.execute(MessageEnum.INVALID_PRICE);

                }
            }
            catch(Exception e){
                MessageHandler.execute(MessageEnum.INVALID_ENTRY);
                s.nextLine();
            }



        }while(input < 1);

        return input;

    }

}
