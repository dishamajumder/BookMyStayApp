// BookMyStayApp.java

/**
 * ============================================================
 * UC2: Basic Room Types & Static Availability
 * ============================================================
 *
 * Description:
 * Demonstrates object modeling using abstraction and inheritance
 * by defining different room types and their availability.
 *
 * Branch: uc2
 * Version: 2.0
 */

// Abstract Base Class
abstract class Room {
    protected String roomType;
    protected int availableRooms;

    // Constructor
    public Room(String roomType, int availableRooms) {
        this.roomType = roomType;
        this.availableRooms = availableRooms;
    }

    // Abstract method
    public abstract void displayDetails();
}

// Single Room Class
class SingleRoom extends Room {

    public SingleRoom(int availableRooms) {
        super("Single Room", availableRooms);
    }

    @Override
    public void displayDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Available Rooms: " + availableRooms);
        System.out.println("----------------------------------");
    }
}

// Double Room Class
class DoubleRoom extends Room {

    public DoubleRoom(int availableRooms) {
        super("Double Room", availableRooms);
    }

    @Override
    public void displayDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Available Rooms: " + availableRooms);
        System.out.println("----------------------------------");
    }
}

// Deluxe Room Class
class DeluxeRoom extends Room {

    public DeluxeRoom(int availableRooms) {
        super("Deluxe Room", availableRooms);
    }

    @Override
    public void displayDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Available Rooms: " + availableRooms);
        System.out.println("----------------------------------");
    }
}

// Main Application
public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("=========== Room Availability ===========");

        // Create room objects with static availability
        Room single = new SingleRoom(5);
        Room doubleRoom = new DoubleRoom(3);
        Room deluxe = new DeluxeRoom(2);

        // Display details
        single.displayDetails();
        doubleRoom.displayDetails();
        deluxe.displayDetails();

        System.out.println("=========================================");
    }
}