public class ClothingItem {
    // Fields
    private String name;
    private double price;
    private String category;
    private boolean inStock;

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

    // Methods
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            this.price = this.price * (1 - percentage / 100);
        } else {
            System.out.println("Invalid discount!");
        }
    }
    public boolean isPremium() {
        return price > 10000;
    }

    @Override
    public String toString() {
        return "ClothingItem{name='" + name + "', price=" + price +
                ", category='" + category + "', inStock=" + inStock + "}";
    }
}