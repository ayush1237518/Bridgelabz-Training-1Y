
 class Clothing extends Product implements Taxable {

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15;   
    }


    @Override
    public double calculateTax() {
        return getPrice() * 0.05;   
    }

    
    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 5%";
    }
    
}
