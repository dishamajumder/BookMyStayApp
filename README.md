# 🏨 BookMyStay - Hotel Booking Management System (UC3)

## 🌿 Branch Information

This branch represents:

👉 **UC3: Centralized Room Inventory Management**

---

## 📌 Objective

The objective of UC3 is to introduce centralized inventory management by replacing scattered availability variables with a single, consistent data structure using HashMap.

---

## 🚀 Overview

In this use case:

* Room availability is stored in a centralized system
* A HashMap is used to manage room types and counts
* All operations (add, update, retrieve) go through one component
* Ensures consistency and prevents data duplication

---

## ⚙️ Procedure

1. Create a class `RoomInventory`
2. Define a `HashMap<String, Integer>` to store data
3. Add methods:

    * addRoomType()
    * getAvailability()
    * updateAvailability()
    * displayInventory()
4. Initialize inventory in main class
5. Add room types
6. Update availability
7. Display results

---

## 🔄 Application Flow

Start
↓
Initialize RoomInventory
↓
Register room types
↓
Store data in HashMap
↓
Update availability via methods
↓
Display inventory
↓
End

---

## 📂 Use Case Details

### ✅ UC3: Centralized Room Inventory Management

**Goal:** Manage room availability using a centralized structure
**Actor:** RoomInventory

### Flow:

* Initialize inventory
* Register room types
* Store availability in HashMap
* Update via controlled methods
* Display current state

---

## 🧠 Key Concepts Used

* HashMap
  → Stores key-value pairs (Room Type → Availability)

* Centralized State Management
  → Single source of truth

* Encapsulation
  → Data accessed only through methods

* Data Consistency
  → Prevents scattered and conflicting values

---

## 📊 Example Output

========= Current Room Inventory =========
Room Type: Single Room | Available: 5
Room Type: Double Room | Available: 3
Room Type: Deluxe Room | Available: 2
=====================================

Updating availability...

========= Current Room Inventory =========
Room Type: Single Room | Available: 4
Room Type: Double Room | Available: 3
Room Type: Deluxe Room | Available: 2
=====================================

---

## ⚡ Design Insight

Before UC3:

* Availability was scattered across objects
* Hard to maintain consistency

After UC3:

* Single source of truth (HashMap)
* Easier updates and scalability

---

## ⚠️ Limitations

* No booking logic yet
* No validation (e.g., overbooking)

---

## 🛠️ Technologies Used

* Java (JDK 8 or above)
* Collections Framework (HashMap)

---

## 🔮 Next Step

➡️ UC4: Booking Logic + Prevent Double Booking

---

## 👨‍💻 Author

Disha Majumder

---

## 📜 License

This project is for educational purposes.
