package commerce;

public class Item {

    private float prix;
    private String label;
    private String ref;

    public Item(float prix, String label, String ref) {
        this.prix = prix;
        this.label = label;
        this.ref = ref;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String displayItem(){
        return "Label : " + this.label + ", Prix : " + this.prix + ", Ref : " + this.ref;
    }
}
