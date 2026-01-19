package menu;

import model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager implements Menu {

    private ArrayList<ClothingItem> items = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public MenuManager() {
        items.add(new Shirt("T-Model.Shirt", 20, "Casual", true, "M", false));
        items.add(new Pants("Jeans", 50, "Jeans", true, 32, 34, "Slim"));
    }

    @Override
    public void displayMenu() {
        System.out.println("\n1. View Items");
        System.out.println("2. Demonstrate Polymorphism");
        System.out.println("0. Exit");
    }

    @Override
    public void run() {
        boolean running = true;

        while (running) {
            displayMenu();
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> items.forEach(ClothingItem::displayDetails);
                    case 2 -> {
                        for (ClothingItem i : items) {
                            i.applyDiscount(10);
                            i.displayDetails();
                        }
                    }
                    case 0 -> running = false;
                    default -> System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}
