package model;

public class Order {

    private int orderId;
    private String customerName;
    private double totalAmount;
    private String status;

    public Order(int orderId, String customerName, double totalAmount, String status) {
        if (orderId <= 0) throw new IllegalArgumentException("Invalid order ID");
        if (totalAmount < 0) throw new IllegalArgumentException("Amount < 0");
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" + orderId + ", " + customerName +
                ", $" + totalAmount + ", " + status + "}";
    }
}
