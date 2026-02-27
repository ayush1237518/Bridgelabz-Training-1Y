
 import java.util.ArrayList;
import java.util.List;

public class FoodDeliverySystem {

    public static void main(String[] args) {

        
        List<FoodItem> order = new ArrayList<>();


        order.add(new VegItem("Paneer Butter Masala", 250, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));

        
        for (FoodItem item : order) {


            item.getItemDetails();

            double total = item.calculateTotalPrice();

            Discountable d = (Discountable) item;
            double discount = d.applyDiscount();

            double finalAmount = total - discount;

            System.out.println(d.getDiscountDetails());
            System.out.println("Total Price : " + total);
            System.out.println("Discount    : " + discount);
            System.out.println("Final Amount: " + finalAmount);

            System.out.println("---------------------------");
        }
    }
}
