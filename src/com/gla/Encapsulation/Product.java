
abstract class Product {

    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        setProductId(productId);
        setName(name);
        setPrice(price);
    }

    public int getProductId() {
        return productId;
    }


    public void setProductId(int productId) {
        if (productId <= 0)
            throw new IllegalArgumentException("Invalid product ID");
        this.productId = productId;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Invalid product name");
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException("Price cannot be negative");
        this.price = price;
    }

   
    public abstract double calculateDiscount();

    public void getProductDetails() {
        System.out.println("Product ID : " + productId);
        System.out.println("Name       : " + name);
        System.out.println("Price      : " + price);
    }
    
}
