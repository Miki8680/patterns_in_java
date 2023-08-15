package command;

import vendor.GarageDoor;

public class GarageDoorCloseCommand implements Command{
    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        System.out.print("Undo : ");
        garageDoor.up();
    }
}
