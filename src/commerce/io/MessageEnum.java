package commerce.io;

public enum MessageEnum {

    ITEM_SOLD_SUCCESS("L'item a bien été vendu"),
    ITEM_SOLD_FAILURE("Item pas vendu"),
    SPECIFY_QUANTITY("Spécifier quantité :"),
    INVALID_ENTRY("Entrée invalide"),
    INVALID_INT("Vous devez entrer un entier"),
    INVALID_QUANTITY("Quantité doit être supérieure à zéro");

    public final String msg;


    private MessageEnum(String msg) {
        this.msg = msg;
    }


    }
