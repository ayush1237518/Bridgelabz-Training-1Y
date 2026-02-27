
 import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {


    public static void main(String[] args) {

        
        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(101, "Java Programming", "James Gosling"));
        items.add(new Magazine(102, "Tech Monthly", "Editor Team"));
        items.add(new DVD(103, "Inception", "Christopher Nolan"));

        Reservable r = (Reservable) items.get(0);
        r.reserveItem("Rahul");

        for (LibraryItem item : items) {

            item.getItemDetails();
            System.out.println("Loan Duration : " + item.getLoanDuration() + " days");

            Reservable res = (Reservable) item;
            System.out.println("Available : " + res.checkAvailability());

            System.out.println("---------------------------");
        }
    }
}
