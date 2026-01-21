package menu;

import model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager implements Menu {

    // ===== DATA STORAGE (same as old Main) =====
    private ArrayList<ClothingItem> allItems = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // ===== CONSTRUCTOR =====
    public MenuManager() {
        seedData();
    }

    // ===== SAMPLE DATA =====
    private void seedData() {
        allItems.add(new ClothingItem("Generic Scarf", 25.99, "Accessories", true) {
            @Override
            public String getItemType() {
                return "";
            }

            @Override
            public void displayDetails() {

            }
        });
        allItems.add(new Shirt("Formal Shirt", 45.50, "Formal", true, "M", true));
        allItems.add(new Pants("Blue Jeans", 59.99, "Jeans", true, 32, 34, "Slim"));
        allItems.add(new Shirt("T-Shirt", 19.99, "Casual", true, "L", false));
        allItems.add(new Pants("Dress Pants", 89.99, "Formal", true, 34, 32, "Regular"));

        customers.add(new Customer(1, "John Doe", "+77771234567", 150));
        orders.add(new Order(1001, "John Doe", 125.48, "Completed"));
    }

    // ===== MENU INTERFACE METHODS =====
    @Override
    public void displayMenu() {
        System.out.println("\n╔════════════════════════════════════════════════════╗");
        System.out.println("║     CLOTHING STORE MANAGEMENT SYSTEM              ║");
        System.out.println("╠════════════════════════════════════════════════════╣");
        System.out.println("║  1. Add Generic Clothing Item                     ║");
        System.out.println("║  2. Add Shirt                                     ║");
        System.out.println("║  3. Add Pants                                     ║");
        System.out.println("║  4. View All Items                                ║");
        System.out.println("║  5. Demonstrate Polymorphism                      ║");
        System.out.println("║  6. View Shirts Only                              ║");
        System.out.println("║  7. View Pants Only                               ║");
        System.out.println("║  8. Add Customer                                  ║");
        System.out.println("║  9. View All Customers                            ║");
        System.out.println("║  10. Add Order                                    ║");
        System.out.println("║  11. View All Orders                              ║");
        System.out.println("║  0. Exit                                          ║");
        System.out.println("╚════════════════════════════════════════════════════╝");
        System.out.print("Choice: ");
    }

    @Override
    public void run() {
        boolean running = true;

        while (running) {
            displayMenu();
            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 -> addGenericItem();
                    case 2 -> addShirt();
                    case 3 -> addPants();
                    case 4 -> viewAllItems();
                    case 5 -> demonstratePolymorphism();
                    case 6 -> viewShirtsOnly();
                    case 7 -> viewPantsOnly();
                    case 8 -> addCustomer();
                    case 9 -> viewAllCustomers();
                    case 10 -> addOrder();
                    case 11 -> viewAllOrders();
                    case 0 -> running = false;
                    default -> System.out.println("Invalid option!");
                }

                if (running) {
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine();
                }

            } catch (Exception e) {
                System.out.println("Input error. Try again.");
            }
        }
    }

    // ===== ITEM METHODS =====
    private void addGenericItem() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.print("Category: ");
        String category = scanner.nextLine();

        System.out.print("In stock (true/false): ");
        boolean inStock = Boolean.parseBoolean(scanner.nextLine());

        allItems.add(new ClothingItem(name, price, category, inStock) {
            @Override
            public String getItemType() {
                return "";
            }

            @Override
            public void displayDetails() {

            }
        });
        System.out.println("Generic item added.");
    }

    private void addShirt() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.print("Category: ");
        String category = scanner.nextLine();

        System.out.print("In stock: ");
        boolean inStock = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Size: ");
        String size = scanner.nextLine();

        System.out.print("Has collar: ");
        boolean hasCollar = Boolean.parseBoolean(scanner.nextLine());

        allItems.add(new Shirt(name, price, category, inStock, size, hasCollar));
        System.out.println("Shirt added.");
    }

    private void addPants() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.print("Category: ");
        String category = scanner.nextLine();

        System.out.print("In stock: ");
        boolean inStock = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Waist: ");
        int waist = Integer.parseInt(scanner.nextLine());

        System.out.print("Length: ");
        int length = Integer.parseInt(scanner.nextLine());

        System.out.print("Fit: ");
        String fit = scanner.nextLine();

        allItems.add(new Pants(name, price, category, inStock, waist, length, fit));
        System.out.println("Pants added.");
    }

    private void viewAllItems() {
        if (allItems.isEmpty()) {
            System.out.println("No items found.");
            return;
        }

        for (ClothingItem item : allItems) {
            System.out.println(item);
        }
    }

    private void demonstratePolymorphism() {
        for (ClothingItem item : allItems) {
            item.displayDetails();
            item.applyDiscount(10);
            System.out.println();
        }
    }

    private void viewShirtsOnly() {
        for (ClothingItem item : allItems) {
            if (item instanceof Shirt shirt) {
                System.out.println(shirt);
            }
        }
    }

    private void viewPantsOnly() {
        for (ClothingItem item : allItems) {
            if (item instanceof Pants pants) {
                System.out.println(pants);
            }
        }
    }

    // ===== CUSTOMER METHODS =====
    private void addCustomer() {
        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Points: ");
        int points = Integer.parseInt(scanner.nextLine());

        customers.add(new Customer(id, name, phone, points));
        System.out.println("Customer added.");
    }

    private void viewAllCustomers() {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }

    // ===== ORDER METHODS =====
    private void addOrder() {
        System.out.print("Order ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Customer name: ");
        String name = scanner.nextLine();

        System.out.print("Total amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.print("Status: ");
        String status = scanner.nextLine();

        orders.add(new Order(id, name, amount, status));
        System.out.println("Order added.");
    }

    private void viewAllOrders() {
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
