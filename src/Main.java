import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // ArrayLists for storing all data
    private static ArrayList<ClothingItem> allItems = new ArrayList<>();
    private static ArrayList<Customer> customers = new ArrayList<>();
    private static ArrayList<Order> orders = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Add some sample items for testing
        allItems.add(new ClothingItem("Generic Scarf", 25.99, "Accessories", true));
        allItems.add(new Shirt("Formal Shirt", 45.50, "Formal", true, "M", true));
        allItems.add(new Pants("Blue Jeans", 59.99, "Jeans", true, 32, 34, "Slim"));
        allItems.add(new Shirt("T-Shirt", 19.99, "Casual", true, "L", false));
        allItems.add(new Pants("Dress Pants", 89.99, "Formal", true, 34, 32, "Regular"));

        // Add sample customer
        customers.add(new Customer(1, "John Doe", "+77771234567", 150));

        // Add sample order
        orders.add(new Order(1001, "John Doe", 125.48, "Completed"));

        boolean running = true;

        while (running) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: addGenericItem(); break;
                case 2: addShirt(); break;
                case 3: addPants(); break;
                case 4: viewAllItems(); break;
                case 5: demonstratePolymorphism(); break;
                case 6: viewShirtsOnly(); break;
                case 7: viewPantsOnly(); break;
                case 8: addCustomer(); break;
                case 9: viewAllCustomers(); break;
                case 10: addOrder(); break;
                case 11: viewAllOrders(); break;
                case 0:
                    running = false;
                    System.out.println("Thank you for using Clothing Store Management System!");
                    break;
                default: System.out.println("Invalid option! Please try again.");
            }

            if (running) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n╔════════════════════════════════════════════════════╗");
        System.out.println("║     CLOTHING STORE MANAGEMENT SYSTEM              ║");
        System.out.println("║     INHERITANCE & POLYMORPHISM DEMO               ║");
        System.out.println("╠════════════════════════════════════════════════════╣");
        System.out.println("║  ITEM MANAGEMENT (Inheritance Demo)               ║");
        System.out.println("║  1. Add Generic Clothing Item                     ║");
        System.out.println("║  2. Add Shirt                                     ║");
        System.out.println("║  3. Add Pants                                     ║");
        System.out.println("║  4. View All Items (Polymorphic List)             ║");
        System.out.println("║  5. Demonstrate Polymorphism                      ║");
        System.out.println("║  6. View Shirts Only                              ║");
        System.out.println("║  7. View Pants Only                               ║");
        System.out.println("╠════════════════════════════════════════════════════╣");
        System.out.println("║  CUSTOMER & ORDER MANAGEMENT                      ║");
        System.out.println("║  8. Add Customer                                  ║");
        System.out.println("║  9. View All Customers                            ║");
        System.out.println("║  10. Add Order                                    ║");
        System.out.println("║  11. View All Orders                              ║");
        System.out.println("╠════════════════════════════════════════════════════╣");
        System.out.println("║  0. Exit                                          ║");
        System.out.println("╚════════════════════════════════════════════════════╝");
        System.out.print("Enter your choice (0-11): ");
    }

    // ============ INHERITANCE & POLYMORPHISM METHODS ============

    private static void addGenericItem() {
        System.out.println("\n══════════════════════════════════════════════════");
        System.out.println("           ADD GENERIC CLOTHING ITEM");
        System.out.println("══════════════════════════════════════════════════");

        System.out.print("Enter item name: ");
        String name = scanner.nextLine();

        System.out.print("Enter price: $");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        System.out.print("Is it in stock? (true/false): ");
        boolean inStock = scanner.nextBoolean();
        scanner.nextLine();

        // POLYMORPHISM: Storing as parent type
        ClothingItem item = new ClothingItem(name, price, category, inStock);
        allItems.add(item);

        System.out.println("\n✓ Generic clothing item added successfully!");
    }

    private static void addShirt() {
        System.out.println("\n══════════════════════════════════════════════════");
        System.out.println("                   ADD SHIRT");
        System.out.println("══════════════════════════════════════════════════");

        System.out.print("Enter shirt name: ");
        String name = scanner.nextLine();

        System.out.print("Enter price: $");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        System.out.print("Is it in stock? (true/false): ");
        boolean inStock = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("Enter size (S/M/L/XL): ");
        String size = scanner.nextLine();

        System.out.print("Has collar? (true/false): ");
        boolean hasCollar = scanner.nextBoolean();
        scanner.nextLine();

        // POLYMORPHISM: Create Shirt but store as ClothingItem
        ClothingItem item = new Shirt(name, price, category, inStock, size, hasCollar);
        allItems.add(item);

        System.out.println("\n✓ Shirt added successfully!");
    }

    private static void addPants() {
        System.out.println("\n══════════════════════════════════════════════════");
        System.out.println("                   ADD PANTS");
        System.out.println("══════════════════════════════════════════════════");

        System.out.print("Enter pants name: ");
        String name = scanner.nextLine();

        System.out.print("Enter price: $");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        System.out.print("Is it in stock? (true/false): ");
        boolean inStock = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("Enter waist size: ");
        int waistSize = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter length: ");
        int length = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter fit (Slim/Regular/Loose): ");
        String fit = scanner.nextLine();

        // POLYMORPHISM: Create Pants but store as ClothingItem
        ClothingItem item = new Pants(name, price, category, inStock, waistSize, length, fit);
        allItems.add(item);

        System.out.println("\n✓ Pants added successfully!");
    }

    private static void viewAllItems() {
        System.out.println("\n══════════════════════════════════════════════════");
        System.out.println("      ALL ITEMS (POLYMORPHIC LIST)");
        System.out.println("══════════════════════════════════════════════════");

        if (allItems.isEmpty()) {
            System.out.println("No items found in inventory.");
            return;
        }

        System.out.println("Total items in inventory: " + allItems.size() + "\n");

        for (int i = 0; i < allItems.size(); i++) {
            ClothingItem item = allItems.get(i);
            System.out.println((i + 1) + ". " + item); // Calls overridden toString()

            // Use instanceof to show child-specific info
            if (item instanceof Shirt) {
                Shirt shirt = (Shirt) item; // Downcasting
                if (shirt.isFormal()) {
                    System.out.println("   [Formal Shirt]");
                }
            } else if (item instanceof Pants) {
                Pants pants = (Pants) item; // Downcasting
                if (pants.isJeans()) {
                    System.out.println("   [Jeans]");
                }
            }
            System.out.println();
        }
    }

    private static void demonstratePolymorphism() {
        System.out.println("\n══════════════════════════════════════════════════");
        System.out.println("        POLYMORPHISM DEMONSTRATION");
        System.out.println("══════════════════════════════════════════════════");

        if (allItems.isEmpty()) {
            System.out.println("No items to demonstrate. Please add items first.");
            return;
        }

        System.out.println("PART 1: Calling displayDetails() on all items:");
        System.out.println("══════════════════════════════════════════════════\n");

        for (ClothingItem item : allItems) {
            item.displayDetails(); // POLYMORPHISM: Same method, different behavior!
        }

        System.out.println("\n══════════════════════════════════════════════════");
        System.out.println("PART 2: Calling applyDiscount(15%) on all items:");
        System.out.println("══════════════════════════════════════════════════\n");

        for (ClothingItem item : allItems) {
            item.applyDiscount(15); // POLYMORPHISM: Different discount logic!
            System.out.println();
        }

        System.out.println("══════════════════════════════════════════════════");
        System.out.println("✓ POLYMORPHISM DEMONSTRATED SUCCESSFULLY!");
        System.out.println("  Same method calls produce different outputs!");
        System.out.println("══════════════════════════════════════════════════");
    }

    private static void viewShirtsOnly() {
        System.out.println("\n══════════════════════════════════════════════════");
        System.out.println("              SHIRTS ONLY");
        System.out.println("══════════════════════════════════════════════════");

        int shirtCount = 0;

        for (ClothingItem item : allItems) {
            if (item instanceof Shirt) { // Filter by type
                Shirt shirt = (Shirt) item; // Downcasting
                shirtCount++;
                System.out.println(shirtCount + ". " + shirt.getName());
                System.out.println("   Price: $" + shirt.getPrice());
                System.out.println("   Size: " + shirt.getSize());
                System.out.println("   Has Collar: " + shirt.hasCollar());

                if (shirt.isFormal()) {
                    System.out.println("   [Formal Wear]");
                }
                System.out.println();
            }
        }

        if (shirtCount == 0) {
            System.out.println("No shirts found in inventory.");
        } else {
            System.out.println("Total shirts: " + shirtCount);
        }
    }

    private static void viewPantsOnly() {
        System.out.println("\n══════════════════════════════════════════════════");
        System.out.println("              PANTS ONLY");
        System.out.println("══════════════════════════════════════════════════");

        int pantsCount = 0;

        for (ClothingItem item : allItems) {
            if (item instanceof Pants) { // Filter by type
                Pants pants = (Pants) item; // Downcasting
                pantsCount++;
                System.out.println(pantsCount + ". " + pants.getName());
                System.out.println("   Price: $" + pants.getPrice());
                System.out.println("   Size: " + pants.getFullSize());
                System.out.println("   Fit: " + pants.getFit());

                if (pants.isJeans()) {
                    System.out.println("   [Denim Jeans]");
                }
                System.out.println();
            }
        }

        if (pantsCount == 0) {
            System.out.println("No pants found in inventory.");
        } else {
            System.out.println("Total pants: " + pantsCount);
        }
    }

    // ============ EXISTING CUSTOMER & ORDER METHODS ============

    private static void addCustomer() {
        System.out.println("\n══════════════════════════════════════════════════");
        System.out.println("               ADD CUSTOMER");
        System.out.println("══════════════════════════════════════════════════");

        System.out.print("Enter customer ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter loyalty points: ");
        int points = scanner.nextInt();
        scanner.nextLine();

        customers.add(new Customer(id, name, phone, points));
        System.out.println("\n✓ Customer added successfully!");
    }

    private static void viewAllCustomers() {
        System.out.println("\n══════════════════════════════════════════════════");
        System.out.println("            ALL CUSTOMERS");
        System.out.println("══════════════════════════════════════════════════");

        if (customers.isEmpty()) {
            System.out.println("No customers found.");
            return;
        }

        for (Customer c : customers) {
            System.out.println(c);
        }
    }

    private static void addOrder() {
        System.out.println("\n══════════════════════════════════════════════════");
        System.out.println("               ADD ORDER");
        System.out.println("══════════════════════════════════════════════════");

        System.out.print("Enter order ID: ");
        int orderId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter total amount: $");
        double totalAmount = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter status (Pending/Processing/Completed/Cancelled): ");
        String status = scanner.nextLine();

        orders.add(new Order(orderId, customerName, totalAmount, status));
        System.out.println("\n✓ Order added successfully!");
    }

    private static void viewAllOrders() {
        System.out.println("\n══════════════════════════════════════════════════");
        System.out.println("              ALL ORDERS");
        System.out.println("══════════════════════════════════════════════════");

        if (orders.isEmpty()) {
            System.out.println("No orders found.");
            return;
        }

        for (Order o : orders) {
            System.out.println(o);
        }
    }
}