package command;

import vendor.Stereo;

public class StereoOff implements Command{
    private Stereo stereo;

    public StereoOff(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
        System.out.println("Stereo is OFF .");
    }
}
