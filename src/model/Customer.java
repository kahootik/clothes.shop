package model;

public class Customer {

    private int id;
    private String name;
    private String phone;
    private int points;

    public Customer(int id, String name, String phone, int points) {
        if (id <= 0) throw new IllegalArgumentException("Invalid ID");
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Customer{id=" + id + ", name='" + name +
                "', phone='" + phone + "', points=" + points + "}";
    }
}
