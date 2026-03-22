// BookMyStayApp.java

import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================
 * UC3: Centralized Room Inventory Management
 * ============================================================
 *
 * Description:
 * This program demonstrates centralized inventory management
 * using a HashMap to store and manage room availability.
 *
 * Branch: uc3
 * Version: 3.0
 */

// Inventory Manager Class
class RoomInventory {

    // Centralized data structure
    private Map<String, Integer> inventory;

    // Constructor
    public RoomInventory() {
        inventory = new HashMap<>();
    }

    // Register room type with availability
    public void addRoomType(String roomType, int count) {
        inventory.put(roomType, count);
    }

    // Get availability
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    // Update availability
    public void updateAvailability(String roomType, int newCount) {
        if (inventory.containsKey(roomType)) {
            inventory.put(roomType, newCount);
        } else {
            System.out.println("Room type not found: " + roomType);
        }
    }

    // Display full inventory
    public void displayInventory() {
        System.out.println("========= Current Room Inventory =========");

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println("Room Type: " + entry.getKey() +
                    " | Available: " + entry.getValue());
        }

        System.out.println("==========================================");
    }
}

// Main Application
public class BookMyStayApp {

    public static void main(String[] args) {

        // Step 1: Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Step 2: Register room types
        inventory.addRoomType("Single Room", 5);
        inventory.addRoomType("Double Room", 3);
        inventory.addRoomType("Deluxe Room", 2);

        // Step 3: Display initial inventory
        inventory.displayInventory();

        // Step 4: Update availability (simulate booking)
        System.out.println("\nUpdating availability...\n");
        inventory.updateAvailability("Single Room", 4);

        // Step 5: Display updated inventory
        inventory.displayInventory();
    }
}