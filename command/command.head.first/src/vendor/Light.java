package vendor;

public class Light {

    private boolean stateLightning;
    private String roomName;

    public Light() {}

    public Light(String roomName) {
        this.roomName = roomName;
    }

    public void on() {
        stateLightning = true;
        System.out.println("lightning switched ON."
                + (roomName == null? "" : " in room " + roomName));
    }

    public void off() {
        stateLightning = false;
        System.out.println("lightning switched OFF."
                + (roomName == null? "" : " in room " + roomName));
    }
}
