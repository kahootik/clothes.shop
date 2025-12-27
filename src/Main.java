import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Step 1: ArrayLists and Scanner
    private static ArrayList<MenuItem> menuItems = new ArrayList<>();
    private static ArrayList<Customer> customers = new ArrayList<>();
    private static ArrayList<Order> orders = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: addMenuItem(); break;
                case 2: viewAllMenuItems(); break;
                case 3: addCustomer(); break;
                case 4: viewAllCustomers(); break;
                case 5: addOrder(); break;
                case 6: viewAllOrders(); break;
                case 0: running = false; break;
                default: System.out.println("Invalid option!");
            }

            if (running) {
                System.out.println("\nPress Enter...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    // ================= METHODS START HERE =================

    private static void displayMenu() {
        System.out.println("===== STORE MENU =====");
        System.out.println("1. Add Menu Item");
        System.out.println("2. View All Menu Items");
        System.out.println("3. Add Customer");
        System.out.println("4. View All Customers");
        System.out.println("5. Add Order");
        System.out.println("6. View All Orders");
        System.out.println("0. Exit");
        System.out.print("Choose option: ");
    }

    private static void addMenuItem() {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        menuItems.add(new MenuItem());
        System.out.println("Menu item added!");
    }

    private static void viewAllMenuItems() {
        if (menuItems.isEmpty()) {
            System.out.println("No menu items.");
            return;
        }

        for (MenuItem item : menuItems) {
            System.out.println(item);
        }
    }

    private static void addCustomer() {
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
        System.out.println("Customer added!");
    }

    private static void viewAllCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
            return;
        }

        for (Customer c : customers) {
            System.out.println(c);
        }
    }

    private static void addOrder() {
        System.out.print("Enter order ID: ");
        int orderId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter total amount: ");
        double totalAmount = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter status: ");
        String status = scanner.nextLine();

        orders.add(new Order(orderId, customerName, totalAmount, status));
        System.out.println("Order added!");
    }

    private static void viewAllOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders found.");
            return;
        }

        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
