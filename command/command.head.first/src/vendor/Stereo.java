package vendor;

public class Stereo {
    private boolean isStereoOn;
    private int volume;
    private boolean isOnCD;
    private boolean isOnDVD;
    private boolean isOnRadio;

    public Stereo() {
        isStereoOn = false;
        isOnCD = false;
        isOnDVD = false;
        isOnRadio = false;
        volume = 0;
    }

    public void on() {
        isStereoOn = true;
    }

    public void off() {
        isStereoOn = false;

        isOnCD = false;
        isOnDVD = false;
        isOnRadio = false;
        volume = 0;
    }

    public void setCD() {
        isOnCD = true;
        isOnDVD = false;
        isOnRadio = false;
    }

    public void setDVD() {
        isOnCD = false;
        isOnDVD = true;
        isOnRadio = false;
    }

    public void setRadio() {
        isOnCD = false;
        isOnDVD = false;
        isOnRadio = true;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
