package commerce.command;

import commerce.Magasin;

public class CommandAddItem implements Command {

    private Magasin mag;

    public CommandAddItem(Magasin mag) {
        this.mag = mag;
    }

    @Override
    public void execute() {

    }
}
