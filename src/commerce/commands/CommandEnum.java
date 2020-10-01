package commerce.commands;

public enum CommandEnum {
    ADD("add"),
    SELL("sell"),
    DISPLAY("display"),
    EXIT("exit"),
    INVALID("invalid");

    public final String label;


    private CommandEnum(String label) {
        this.label = label;
    }

}
