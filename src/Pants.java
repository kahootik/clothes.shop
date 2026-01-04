public class Pants extends ClothingItem {
    // Additional fields specific to Pants
    private int waistSize;
    private int length;
    private String fit; // Slim, Regular, Loose

    // Constructor using super()
    public Pants(String name, double price, String category, boolean inStock,
                 int waistSize, int length, String fit) {
        super(name, price, category, inStock);
        this.waistSize = waistSize;
        this.length = length;
        this.fit = fit;
    }

    // Getters and Setters
    public int getWaistSize() {
        return waistSize;
    }

    public void setWaistSize(int waistSize) {
        if (waistSize > 0) {
            this.waistSize = waistSize;
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    // Override methods from parent
    @Override
    public String getItemType() {
        return "Pants";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("  Waist: " + waistSize + " | Length: " + length + " | Fit: " + fit);
    }

    @Override
    public void applyDiscount(double percentage) {
        System.out.print("Pants-specific discount: ");
        // Pants might have different discount calculation
        if (category.equalsIgnoreCase("Jeans") && percentage < 30) {
            percentage += 5; // Extra discount for jeans
            System.out.println("Additional 5% for jeans!");
        }
        super.applyDiscount(percentage);
    }

    // Pants-specific methods
    public boolean isJeans() {
        return category.equalsIgnoreCase("Jeans");
    }

    public String getFullSize() {
        return waistSize + "x" + length;
    }

    public void measure() {
        System.out.println("Pants measurement: Waist " + waistSize + ", Length " + length);
    }

    @Override
    public String toString() {
        return super.toString() + " | Size: " + getFullSize() + " | Fit: " + fit;
    }
}