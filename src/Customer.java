public class Customer {
    // Fields
    private int customerId;
    private String name;
    private String phone;
    private int loyaltyPoints;

    // Constructor with 4 parameters - using setters for validation
    public Customer(int customerId, String name, String phone, int loyaltyPoints) {
        setCustomerId(customerId);
        setName(name);
        setPhone(phone);
        setLoyaltyPoints(loyaltyPoints);
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

    // Setters with validation
    public void setCustomerId(int customerId) {
        if (customerId > 0) {
            this.customerId = customerId;
        } else {
            System.out.println("Error: Customer ID must be positive. Setting to 0.");
            this.customerId = 0;
        }
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim();
        } else {
            System.out.println("Error: Name cannot be null or empty. Setting to 'Unknown'.");
            this.name = "Unknown";
        }
    }

    public void setPhone(String phone) {
        // Basic phone validation - you can adjust this based on your needs
        if (phone != null && phone.matches("\\+?[0-9\\-\\(\\)\\s]{7,15}")) {
            this.phone = phone.trim();
        } else {
            System.out.println("Error: Invalid phone number. Setting to 'No phone'.");
            this.phone = "No phone";
        }
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        if (loyaltyPoints >= 0) {
            this.loyaltyPoints = loyaltyPoints;
        } else {
            System.out.println("Warning: Loyalty points cannot be negative! Setting to 0.");
            this.loyaltyPoints = 0;
        }
    }

    // Methods
    public void addLoyaltyPoints(int points) {
        if (points > 0) {
            loyaltyPoints += points;
            System.out.println("Added " + points + " loyalty points. Total: " + loyaltyPoints);
        } else if (points < 0) {
            System.out.println("Error: Cannot add negative points. Use deductLoyaltyPoints() instead.");
        }
    }

    public boolean deductLoyaltyPoints(int points) {
        if (points > 0) {
            if (loyaltyPoints >= points) {
                loyaltyPoints -= points;
                System.out.println("Deducted " + points + " loyalty points. Remaining: " + loyaltyPoints);
                return true;
            } else {
                System.out.println("Error: Insufficient loyalty points. Current: " + loyaltyPoints + ", Required: " + points);
                return false;
            }
        } else {
            System.out.println("Error: Points to deduct must be positive.");
            return false;
        }
    }

    public boolean isVIP() {
        return loyaltyPoints > 100;
    }

    @Override
    public String toString() {
        String vipStatus = isVIP() ? " (VIP)" : "";
        return "Customer{customerId=" + customerId + ", name='" + name + "'" + vipStatus +
                ", phone='" + phone + "', points=" + loyaltyPoints + "}";
    }
}