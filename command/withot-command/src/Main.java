import model.Bathroom;
import model.Bedroom;
import model.Kitchen;
import model.LivingRoom;
import model.room.Room;

public class Main {
    public static void main(String[] args) {
        House house = new House();
        house.addRoom(new LivingRoom());
        house.addRoom(new Bathroom());
        house.addRoom(new Kitchen());
        house.addRoom(new Bedroom());
        house.addRoom(new Bedroom());
        house.rooms.forEach(Room::switchLights);
        System.out.println("312z");
    }
}