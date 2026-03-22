# 🏨 BookMyStay - Hotel Booking Management System (UC2)

## 🌿 Branch Information

This branch represents:

👉 **UC2: Basic Room Types & Static Availability**

---

## 📌 Objective

The objective of UC2 is to introduce object modeling using abstraction and inheritance, allowing the system to represent different room types before introducing complex data structures.

---

## 🚀 Overview

In this use case:

* Different room types are modeled as classes
* A base abstract class defines common properties
* Each room type extends the base class
* Availability is stored using simple variables
* Room details are displayed on the console

This establishes a strong foundation for future system expansion.

---

## ⚙️ Procedure

1. Create an abstract class `Room`
2. Define common attributes:

    * roomType
    * availableRooms
3. Create subclasses:

    * SingleRoom
    * DoubleRoom
    * DeluxeRoom
4. Override `displayDetails()` method
5. Create objects in main class
6. Print room details

---

## 🔄 Application Flow

Start
↓
User runs application
↓
Create room objects
↓
Assign static availability
↓
Display room details
↓
End

---

## 📂 Use Case Details

### ✅ UC2: Basic Room Types & Static Availability

**Goal:** Model room types using OOP concepts
**Actor:** User

### Flow:

* User runs the application
* Room objects are created
* Availability is stored using variables
* Room details are displayed
* Application terminates

---

## 🧠 Key Concepts Used

* Abstraction
  → Abstract class defines common structure

* Inheritance
  → Room types extend base class

* Method Overriding
  → Each room defines its own behavior

* Encapsulation
  → Data and behavior grouped together

* Static Data Handling
  → Availability stored using variables

---

## 📊 Example Output

=========== Room Availability ===========
Room Type: Single Room
Available Rooms: 5
------------------

Room Type: Double Room
Available Rooms: 3
------------------

Room Type: Deluxe Room
Available Rooms: 2
------------------

=========================================

---

## ⚡ Design Insight

At this stage:

* We focus on **modeling real-world entities**
* No data structures yet
* System is **rigid but simple**

This is intentional before moving to dynamic handling.

---

## 🛠️ Technologies Used

* Java (JDK 8 or above)
* VS Code / IntelliJ / Eclipse

---

## 🔮 Next Step

➡️ UC3: Introduce booking logic (basic allocation)

---

## 👨‍💻 Author

Disha Majumder

---

## 📜 License

This project is for educational purposes.
