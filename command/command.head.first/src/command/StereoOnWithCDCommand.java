package command;

import vendor.Stereo;

public class StereoOnWithCDCommand implements Command{
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume( 11);
        System.out.println("Stereo is ON with CD and volume = 11 .");
    }

    @Override
    public void undo() {
        stereo.off();
        System.out.println("Stereo is OFF.");
    }
}
