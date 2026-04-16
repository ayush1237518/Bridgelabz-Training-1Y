import java.util.*;

class Product {
    String name;
    double price;
    double rating;

    Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String toString() {
        return name + " - Price: " + price + ", Rating: " + rating;
    }
}

public class ProductSorting {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", 20000, 4.5));
        products.add(new Product("Laptop", 50000, 4.8));
        products.add(new Product("Tablet", 15000, 4.2));

        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));

        System.out.println("Sorted by Price:");
        products.forEach(System.out::println);
    }
}