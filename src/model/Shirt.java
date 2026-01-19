package model;

public class Shirt extends ClothingItem {

    private String size;
    private boolean hasCollar;

    public Shirt(String name, double price, String category, boolean inStock,
                 String size, boolean hasCollar) {
        super(name, price, category, inStock);
        this.size = size;
        this.hasCollar = hasCollar;
    }

    @Override
    public String getItemType() {
        return "Shirt";
    }

    @Override
    public void displayDetails() {
        System.out.println(this + " | Size: " + size + " | Collar: " + hasCollar);
    }

    public boolean isFormal() {
        return hasCollar;
    }
}
