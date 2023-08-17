import command.CeilingFanHighCommand;
import command.CeilingFanLowCommand;
import command.CeilingFanMediumCommand;
import command.CeilingFanOffCommand;
import control.RemoteControl;
import vendor.CeilingFan;

public class RemoteLoaderTestCeilingFan {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        CeilingFan ceilingFan = new CeilingFan("living room fan");

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(2, ceilingFanLowCommand, ceilingFanOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPressed();
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPressed();
        System.out.println(remoteControl);


    }
}
