package commerce;


import commerce.domain.Magasin;
import commerce.domain.Menu;

public class Main {



    public static void main(String[] args){

        Menu menu = new Menu();

        menu.startMenu(new Magasin("Mon super magasin"));

    }




}
