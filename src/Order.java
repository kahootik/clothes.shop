public class Order {
    private int orderId;
    private String customerName;
    private double totalAmount;
    private String status;

    // Constructor with 4 parameters
    public Order(int orderId, String customerName, double totalAmount, String status) {
        setOrderId(orderId);
        setCustomerName(customerName);
        setTotalAmount(totalAmount);
        setStatus(status);
    }

    // Default constructor
    public Order() {

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

    // Setters with validation
    public void setOrderId(int orderId) {
        if (orderId > 0) {
            this.orderId = orderId;
        } else {
            System.out.println("Error: Order ID must be positive.");
            this.orderId = 0;
        }
    }

    public void setCustomerName(String customerName) {
        if (customerName != null && !customerName.trim().isEmpty()) {
            this.customerName = customerName.trim();
        } else {
            System.out.println("Error: Customer name cannot be empty.");
            this.customerName = "Unknown";
        }
    }

    public void setTotalAmount(double totalAmount) {
        if (totalAmount >= 0) {
            this.totalAmount = totalAmount;
        } else {
            System.out.println("Error: Total amount cannot be negative.");
            this.totalAmount = 0.0;
        }
    }

    public void setStatus(String status) {
        String[] validStatuses = {"Pending", "Processing", "Completed", "Cancelled"};
        if (status != null) {
            for (String validStatus : validStatuses) {
                if (validStatus.equalsIgnoreCase(status.trim())) {
                    this.status = validStatus;
                    return;
                }
            }
            System.out.println("Error: Invalid status. Setting to 'Pending'.");
        }
        this.status = "Pending";
    }

    // Methods
    public void completeOrder() {
        this.status = "Completed";
    }

    public boolean isPending() {
        return status.equals("Pending");
    }

    @Override
    public String toString() {
        return "Order{orderId=" + orderId + ", customerName='" + customerName +
                "', totalAmount=" + totalAmount + ", status='" + status + "'}";
    }

    public void addAmount(double v) {
    }
}