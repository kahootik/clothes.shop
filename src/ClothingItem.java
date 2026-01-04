public class ClothingItem {
    // Protected fields for inheritance
    protected String name;
    protected double price;
    protected String category;
    protected boolean inStock;

    // Constructor with 4 parameters
    public ClothingItem(String name, double price, String category, boolean inStock) {
        this.name = name;
        setPrice(price);
        this.category = category;
        this.inStock = inStock;
    }

    // Default constructor
    public ClothingItem() {
        this.name = "Unknown Item";
        this.price = 0.0;
        this.category = "General";
        this.inStock = true;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean isInStock() {
        return inStock;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Warning: Price cannot be negative! Setting to 0.");
            this.price = 0;
        }
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    // Methods for inheritance and polymorphism
    public String getItemType() {
        return "Generic Clothing Item";
    }

    public void displayDetails() {
        System.out.println(getItemType() + ": " + name + " - $" + price);
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            double discount = price * (percentage / 100);
            price -= discount;
            System.out.println("Applied " + percentage + "% discount to " + name + ". New price: $" + price);
        } else {
            System.out.println("Invalid discount percentage!");
        }
    }

    public boolean isPremium() {
        return price > 10000;
    }

    @Override
    public String toString() {
        return "[" + getItemType() + "] " + name + " - $" + price +
                " | Category: " + category + " | In Stock: " + inStock;
    }
}