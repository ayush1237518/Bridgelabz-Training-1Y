
 class Groceries extends Product {

    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }


    
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;   
    }
}
