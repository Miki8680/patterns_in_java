package vendor;

public class Light {

    private boolean stateLightning;

    public void on() {
        stateLightning = true;
        System.out.println("lightning switched ON.");
    }

    public void off() {
        stateLightning = false;
        System.out.println("lightning switched OFF.");
    }
}
