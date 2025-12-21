public class Customer {
    // Fields
    private int customerId;
    private String name;
    private String phone;
    private int loyaltyPoints;

    // Constructor with 4 parameters
    public Customer(int customerId, String name, String phone, int loyaltyPoints) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.loyaltyPoints = loyaltyPoints;
    }

    // Default constructor
    public Customer() {
        this.customerId = 0;
        this.name = "Unknown";
        this.phone = "No phone";
        this.loyaltyPoints = 0;
    }

    // Getters
    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    // Setters
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    // Methods
    public void addLoyaltyPoints(int points) {
        loyaltyPoints = loyaltyPoints + points;
    }

    public boolean isVIP() {
        return loyaltyPoints > 100;
    }

    @Override
    public String toString() {
        return "Customer{customerId=" + customerId + ", name='" + name +
                "', phone='" + phone + "', points=" + loyaltyPoints + "}";
    }
}