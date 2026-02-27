
 class VegItem extends FoodItem implements Discountable {

    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }



    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;  
    }

    
    @Override
    public String getDiscountDetails() {
        return "Veg Discount: 5%";
    }
}
