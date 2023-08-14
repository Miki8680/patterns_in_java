package model.room;

import model.room.equipment.Light;
import model.room.equipment.commands.Command;

public class Room {

    Command command;

    public Room() { }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
