package commerce.command;

import commerce.Magasin;

public class CommandDisplayMag implements Command {

    private Magasin mag;

    public CommandDisplayMag(Magasin mag) {
        this.mag = mag;
    }

    @Override
    public void execute() {

    }
}
