
abstract class FoodItem {

    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        setItemName(itemName);
        setPrice(price);
        setQuantity(quantity);
    }


    public String getItemName() {
        return itemName;
    }

    
    public void setItemName(String itemName) {
        if (itemName == null || itemName.isEmpty())
            throw new IllegalArgumentException("Invalid item name");
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException("Invalid price");
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0)
            throw new IllegalArgumentException("Quantity must be positive");
        this.quantity = quantity;
    }

    // -------- Abstract behaviour --------
    public abstract double calculateTotalPrice();

    // -------- Concrete behaviour --------
    public void getItemDetails() {
        System.out.println("Item     : " + itemName);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);
    }
}
