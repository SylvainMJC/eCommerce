package commerce.io;

public enum MessageEnum {

    ITEM_SOLD_SUCCESS("L'item a bien été vendu"),
    ITEM_SOLD_FAILURE("Item pas vendu"),
    SPECIFY_QUANTITY("Spécifier quantité :"),
    INVALID_ENTRY("Entrée invalide"),
    INVALID_INT("Vous devez entrer un entier"),
    INVALID_QUANTITY("Quantité doit être supérieure à zéro"),
    ITEM_ADD_SUCCESS("Item Ajouté"),
    ITEM_ADD_FAILURE("Item pas ajouté."),
    SPECIFY_PRICE("Spécifier le prix : "),
    INVALID_PRICE("Le prix doit être supérieur à 0"),
    SPECIFY_REFERENCE("Référence item à vendre :");
    public final String msg;


    private MessageEnum(String msg) {
        this.msg = msg;
    }


    }
