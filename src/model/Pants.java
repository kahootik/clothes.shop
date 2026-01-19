package model;

public class Pants extends ClothingItem {

    private int waist;
    private int length;
    private String fit;

    public Pants(String name, double price, String category, boolean inStock,
                 int waist, int length, String fit) {
        super(name, price, category, inStock);
        this.waist = waist;
        this.length = length;
        this.fit = fit;
    }

    @Override
    public String getItemType() {
        return "Pants";
    }

    @Override
    public void displayDetails() {
        System.out.println(this + " | Size: " + waist + "x" + length + " | Fit: " + fit);
    }

    public boolean isJeans() {
        return category.equalsIgnoreCase("Jeans");
    }
}
