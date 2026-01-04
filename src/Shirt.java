public class Shirt extends ClothingItem {
    // Additional fields specific to Shirt
    private String size; // S, M, L, XL
    private boolean hasCollar;

    // Constructor using super()
    public Shirt(String name, double price, String category, boolean inStock,
                 String size, boolean hasCollar) {
        super(name, price, category, inStock); // MUST BE FIRST LINE
        this.size = size;
        this.hasCollar = hasCollar;
    }

    // Getters and Setters
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean hasCollar() {
        return hasCollar;
    }

    public void setHasCollar(boolean hasCollar) {
        this.hasCollar = hasCollar;
    }

    // Override methods from parent
    @Override
    public String getItemType() {
        return "Shirt";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("  Size: " + size + " | Collar: " + (hasCollar ? "Yes" : "No"));
    }

    @Override
    public void applyDiscount(double percentage) {
        System.out.print("Shirt-specific discount: ");
        super.applyDiscount(percentage);
        // Shirts might have additional discount logic
        if (percentage > 20) {
            System.out.println("  Great deal on shirts!");
        }
    }

    // Shirt-specific methods
    public boolean isFormal() {
        return hasCollar && !category.equalsIgnoreCase("Casual");
    }

    public void tryOn() {
        System.out.println("Trying on shirt: " + name + " (Size: " + size + ")");
    }

    @Override
    public String toString() {
        return super.toString() + " | Size: " + size + " | Has Collar: " + hasCollar;
    }
}