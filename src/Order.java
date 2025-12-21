public class Order {
    // Fields
    private int orderId;
    private String customerName;
    private double totalAmount;
    private String status;

    // Constructor with 4 parameters
    public Order(int orderId, String customerName, double totalAmount, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    // Default constructor
    public Order() {
        this.orderId = 0;
        this.customerName = "Unknown";
        this.totalAmount = 0.0;
        this.status = "Pending";
    }

    // Getters
    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Methods
    public void completeOrder() {
        status = "Completed";
    }

    public boolean isPending() {
        return status.equals("Pending");
    }

    public void addAmount(double amount) {
        totalAmount = totalAmount + amount;
    }

    @Override
    public String toString() {
        return "Order{orderId=" + orderId + ", customerName='" + customerName +
                "', totalAmount=" + totalAmount + ", status='" + status + "'}";
    }
}