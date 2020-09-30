package commerce.io;

import java.util.Scanner;

public class QuantityHandler {

    public static int execute(){

        Scanner s = new Scanner(System.in);

        MessageHandler.execute(MessageEnum.SPECIFY_QUANTITY);

        int input = 0;

        do {

            try {

                input = s.nextInt();

                if(input < 1){

                    MessageHandler.execute(MessageEnum.INVALID_QUANTITY);

                }
            }
            catch(Exception e){
                MessageHandler.execute(MessageEnum.INVALID_INT);
                s.nextLine();
            }



        }while(input < 1);

        return input;



    }

}
