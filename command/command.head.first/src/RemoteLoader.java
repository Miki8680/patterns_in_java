import command.*;
import control.RemoteControl;
import vendor.GarageDoor;
import vendor.Light;
import vendor.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("LIVING ROOM");
        Light kitchenLight = new Light("KITCHEN");
        Light corridorLight = new Light();

        GarageDoor garageDoor = new GarageDoor();

        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOnCommand kitchenRoomLightOnCommand = new LightOnCommand(kitchenLight);
        LightOnCommand corridorLightOnCommand = new LightOnCommand(corridorLight);

        LightOffCommand livingRoomLightOffCommand = new LightOffCommand( livingRoomLight);
        LightOffCommand kitchenRoomLightOffCommand = new LightOffCommand( kitchenLight);
        LightOffCommand corridorLightOffCommand = new LightOffCommand( corridorLight);

        GarageDoorOpenCommand garageOpenDoor = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageCloseDoor = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOff stereoOff = new StereoOff(stereo);

        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenRoomLightOnCommand, kitchenRoomLightOffCommand);
        remoteControl.setCommand(2, corridorLightOnCommand, corridorLightOffCommand);
        remoteControl.setCommand(3, garageOpenDoor, garageCloseDoor);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOff);

        System.out.println( remoteControl);

        for (int slot = 0; slot < remoteControl.getCountSlots(); slot++) {
            remoteControl.onButtonWasPushed(slot);
            remoteControl.offButtonWasPushed(slot);
        }

        System.out.println( remoteControl);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        System.out.println( remoteControl);

        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPressed();
        System.out.println( remoteControl);

    }
}
