public class Main {
    public static void main(String[] args) {
        // Step 1: Welcome Message
        System.out.println("=== Clothing Store Management System ===");
        System.out.println();

        // Step 2: Create Objects
        // Create ClothingItem objects - FIXED: Correct parameter types
        ClothingItem item1 = new ClothingItem("Leather Jacket", 25000.0, "Outerwear", true);
        ClothingItem item2 = new ClothingItem("T-Shirt", 4500.0, "Casual", true);
        ClothingItem item3 = new ClothingItem(); // Default constructor

        // Create Order objects - FIXED: Correct parameter types
        Order order1 = new Order(1001, "Alice Johnson", 29500.0, "Pending");
        Order order2 = new Order(1002, "Bob Smith", 4500.0, "Pending");

        // Create Customer objects - FIXED: Correct parameter types
        Customer customer1 = new Customer(5001, "Alice Johnson", "+77011234567", 50);
        Customer customer2 = new Customer(5002, "Bob Smith", "+77012345678", 150);

        // Step 3: Display All Objects
        System.out.println("--- CLOTHING ITEMS ---");
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        System.out.println();

        System.out.println("--- ORDERS ---");
        System.out.println(order1);
        System.out.println(order2);
        System.out.println();

        System.out.println("--- CUSTOMERS ---");
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println();

        // Step 4: Test Getters
        System.out.println("--- TESTING GETTERS ---");
        System.out.println("Item 1 name: " + item1.getName());
        System.out.println("Item 1 price: " + item1.getPrice() + " KZT");
        System.out.println("Order 1 status: " + order1.getStatus());
        System.out.println("Customer 1 points: " + customer1.getLoyaltyPoints());
        System.out.println();

        // Step 5: Test Setters
        System.out.println("--- TESTING SETTERS ---");
        System.out.println("Updating item3...");
        item3.setName("Jeans");
        item3.setPrice(12000.0);
        item3.setCategory("Bottomwear");
        item3.setInStock(true);
        System.out.println("Updated: " + item3);
        System.out.println();

        System.out.println("Changing order2 customer...");
        order2.setCustomerName("Peter Parker");
        System.out.println("Updated: " + order2);
        System.out.println();

        // Step 6: Test Additional Methods
        // Test ClothingItem methods
        System.out.println("--- TESTING CLOTHINGITEM METHODS ---");
        System.out.println(item1.getName() + " is premium: " + item1.isPremium());
        System.out.println("Applying 20% discount to " + item1.getName());
        item1.applyDiscount(20);
        System.out.println("New price: " + item1.getPrice() + " KZT");
        System.out.println();

        // Test Order methods
        System.out.println("--- TESTING ORDER METHODS ---");
        System.out.println("Order " + order1.getOrderId() + " pending: " + order1.isPending());
        order1.completeOrder();
        System.out.println("Order " + order1.getOrderId() + " status: " + order1.getStatus());
        System.out.println();

        System.out.println("Adding to order " + order2.getOrderId());
        order2.addAmount(1500.0);
        order2.addAmount(2000.0);
        System.out.println("Order " + order2.getOrderId() + " total: " + order2.getTotalAmount() + " KZT");
        System.out.println();

        // Test Customer methods
        System.out.println("--- TESTING CUSTOMER METHODS ---");
        System.out.println(customer1.getName() + " is VIP: " + customer1.isVIP());
        System.out.println(customer2.getName() + " is VIP: " + customer2.isVIP());
        System.out.println();

        System.out.println("Adding 60 points to " + customer1.getName());
        customer1.addLoyaltyPoints(60);
        System.out.println(customer1.getName() + " points: " + customer1.getLoyaltyPoints());
        System.out.println(customer1.getName() + " is VIP: " + customer1.isVIP());
        System.out.println();

        // Step 7: Final Summary
        System.out.println("--- FINAL STATE ---");
        System.out.println("Clothing Items:");
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        System.out.println();

        System.out.println("Orders:");
        System.out.println(order1);
        System.out.println(order2);
        System.out.println();

        System.out.println("Customers:");
        System.out.println(customer1);
        System.out.println(customer2);

        System.out.println("\n=== Program Complete ===");
    }
}