package vendor;

public class GarageDoor {
    private boolean doorIsOpening;
    private boolean doorIsStopped;
    private boolean lightIsLightning;

    public void up() {
        doorIsOpening = true;
        doorIsStopped = false;
        System.out.println("Garage door is OPENED");
    }

    public void down() {
        doorIsOpening = false;
        doorIsStopped = false;
        System.out.println("Garage door is CLOSED");
    }

    public void stop() {
        doorIsOpening = false;
        doorIsStopped = true;
        System.out.println("Garage door is STOPPED");
    }

    public void lightOn() {
        lightIsLightning = true;
        System.out.println("Light in garage is SWITCHED ON");
    }

    public void lightOff() {
        lightIsLightning = false;
        System.out.println("Light in garage is SWITCHED OFF");
    }

}
