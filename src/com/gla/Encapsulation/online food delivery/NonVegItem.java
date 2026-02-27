
 class NonVegItem extends FoodItem implements Discountable {
 

    private static final double EXTRA_CHARGE = 50;  

    
    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + EXTRA_CHARGE;
    }


    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.03;  
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Discount: 3%";
    }
}
