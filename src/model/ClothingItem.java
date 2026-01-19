package model;

import interfaces.Discountable;

public abstract class ClothingItem implements Discountable {

    protected String name;
    protected double price;
    protected String category;
    protected boolean inStock;

    public ClothingItem(String name, double price, String category, boolean inStock) {
        setName(name);
        setPrice(price);
        setCategory(category);
        this.inStock = inStock;
    }

    // ABSTRACT METHOD (REQUIRED)
    public abstract String getItemType();

    public abstract void displayDetails();

    // Getters
    public String getName() { return name; }
    public double getPrice() { return price; }

    // Setters WITH EXCEPTIONS
    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Item name cannot be empty");
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException("Price cannot be negative");
        this.price = price;
    }

    public void setCategory(String category) {
        if (category == null || category.trim().isEmpty())
            throw new IllegalArgumentException("Category cannot be empty");
        this.category = category;
    }

    @Override
    public void applyDiscount(double percent) {
        if (percent <= 0 || percent > 100)
            throw new IllegalArgumentException("Invalid discount percent");
        price -= price * percent / 100;
    }

    @Override
    public String toString() {
        return "[" + getItemType() + "] " + name + " - $" + price;
    }
}
