# Customer and Passenger Information System (OOP Java)
## Project Description
This Java program is designed to demonstrate the fundamental application of Object-Oriented Programming (OOP) concepts: **Inheritance**, **Method Overloading**, and **Method Overriding**.
The program consists of two main classes: `Pelanggan` (Customer, as the base class) and `Penumpang` (Passenger, as a subclass of `Pelanggan`). The `Pelanggan` class features an overloaded `tampilkanInfo()` method, while the `Penumpang` class overrides the `tampilkanInfo()` method to display more specific passenger information. The goal is to understand hierarchical relationships between objects and method flexibility in various contexts.
*(Please note: Some parts of the codebase, including variable names, are written in Indonesian for clarity among local developers.)*
## Key OOP Concepts Utilized
* **Inheritance:**
    * The `Penumpang` class is a subclass that inherits attributes (`nama`, `jenisIdentitas`) and methods (`tampilkanInfo()`) from the `Pelanggan` superclass. This promotes code reuse and establishes an "is-a"        relationship (e.g., a Passenger is a Customer).
* **Method Overloading:**
    * The `Pelanggan` class has two overloaded versions of the `tampilkanInfo()` method:
        * `tampilkanInfo()`: To display basic customer name and identity type.
        * `tampilkanInfo(String tujuanPerjalanan)`: To display basic customer information plus travel destination details.
* **Method Overriding:**
    * The `Penumpang` class overrides the no-argument `tampilkanInfo()` method from the `Pelanggan` class. Its implementation of `tampilkanInfo()` first calls the parent's `tampilkanInfo()` method                     (`super.tampilkanInfo()`) and then adds specific passenger details (airline, ticket price, discount).
## Class Structure
This project consists of two main classes and a `Main` class:
### `Pelanggan.java` (Customer Class)
* **Purpose:** Represents basic customer information.
* **Attributes:** `nama` (String - name), `jenisIdentitas` (String - identity type).
* **Constructor:** `public Pelanggan(String nama, String jenisIdentitas)`
* **Methods:**
    * `public void tampilkanInfo()`: Displays name and identity type.
    * `public void tampilkanInfo(String tujuanPerjalanan)`: Overloaded method to display name, identity type, and travel destination.
### `Penumpang.java` (Passenger Class)
* **Purpose:** Represents a passenger, specializing from `Pelanggan`.
* **Inherits from:** `Pelanggan`
* **Additional Attributes:** `maskapai` (String - airline), `hargaTiket` (double - ticket price), `diskon` (double - discount).
* **Constructor:** `public Penumpang(String nama, String jenisIdentitas, String maskapai, double hargaTiket, double diskon)`
* **Overridden Method:**
    * `@Override public void tampilkanInfo()`: Displays all passenger information (inherited and specific).
### `Main.java`
* **Purpose:** The program's entry point to demonstrate the functionality of `Pelanggan` and `Penumpang` classes.
* **Main Content:**
    * Creates a `Penumpang` object.
    * Demonstrates calling the overridden `tampilkanInfo()` method (`penumpang1.tampilkanInfo()`).
    * Demonstrates calling the overloaded `tampilkanInfo()` method (`penumpang1.tampilkanInfo("Jakarta-Bali")`).
## Project Structure
This project is organized with a standard Java folder structure:
```
.
└── src/
|   ├── Pelanggan.java
|   ├── Penumpang.java
|   └── Main.java
└── README.md
```
# Usage Example (Console Output)
Here is an example of the program output in the console when executed:
```
=== Informasi Penumpang ===
Nama: Rafly Zulfikar AlKautsar
Jenis Identitas: KTP
Maskapai: Garuda Indonesia
Harga Tiket: 1500000.0
Diskon: 10.0%

=== Informasi Penumpang + Tujuan ===
Nama: Rafly Zulfikar AlKautsar
Jenis Identitas: KTP
Tujuan Perjalanan: Jakarta-Bali
```
## How to Run the Project
To run this program, you need to have the Java Development Kit (JDK) installed on your system.
1.  **Prepare Files**
    Ensure all `.java` files are located in the `src/` folder within your project directory.
2.  **Compile Code**
    Open your terminal or Command Prompt, navigate to the root directory of your project (the folder where `src/` and `README.md` are located), and compile all Java files:
    ```
    javac src/*.java
    ```
3.  **Run the Program**
    Once successfully compiled, you can run the program:
    ```
    java -cp src Main
    ```
