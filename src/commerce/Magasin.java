package commerce;

import java.util.HashMap;
import java.util.Map;

public class Magasin {

    private String nom;
    private HashMap<Item,Integer> stock;
    private float capital;

    public Magasin(String nom) {
        this.nom = nom;
        this.stock = new HashMap<Item, Integer>();
        this.capital = 0;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Map<Item, Integer> getStock() {
        return stock;
    }

    public void setStock(HashMap<Item, Integer> stock) {
        this.stock = stock;
    }

    public boolean addItem(Item i,int qte){

        boolean res = false;
        try{
            this.stock.put(i,qte);
            res = true;
        }catch(Exception e){
            System.out.println("Erreur");
        }

        return res;

    }

    public boolean sellItem(String ref, int qte2){

        boolean res = false;
        Item i = null;
        for(Item item : this.stock.keySet()) {

            if (ref.equals(item.getRef())) {

                i = item;
                break;
            }

        }

        try{
            int qte = this.stock.get(i);
            if(qte2>qte){
                qte2=qte;

            }
            this.stock.put(i,qte-qte2);
            if(this.stock.get(i)<1){
                this.stock.remove(i);
                System.out.println("Cet item n'a plus de stock");
            }
            this.capital += (qte2 * i.getPrix());
            res = true;
        }
        catch(NullPointerException e){
            System.out.println("Cet item n'existe pas");
        }

        return res;

    }

    public void display(){
        for (Item i : this.stock.keySet()) {
            System.out.println(i.displayItem() + ", Quantité : " + this.stock.get(i));
        }
        System.out.println(this.getNom() + " a un capital de " + this.getCapital() + " €");
    }

}
