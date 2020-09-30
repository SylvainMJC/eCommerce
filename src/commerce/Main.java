package commerce;


import java.util.Scanner;

public class Main {



    public static void main(String[] args){

        Menu menu = new Menu();

        menu.startMenu(new Magasin("Mon super magasin"));

    }

    public static void cmdSellItem(Magasin mag){


    }

    public static void cmdAddItem(Magasin mag){

        boolean res = false;

        Scanner s = new Scanner(System.in);
        String input;

        System.out.println("Nom item à ajouter :");
        input = s.nextLine();
        String label = input;

        System.out.println("Référence item à ajouter :");
        input = s.nextLine();
        String ref = input;

        System.out.println("Prix item à ajouter :");
        input = s.nextLine();
        int prix = Integer.parseInt(input);

        System.out.println("Quantité item à ajouter :");
        input = s.nextLine();
        int qte = Integer.parseInt(input);

        Item i = new Item(prix, label, ref);
        res = mag.addItem(i, qte);

        if(res){
            System.out.println("Item ajouté");
        }else{
            System.out.println("Item pas ajouté");
        }
    }
}
