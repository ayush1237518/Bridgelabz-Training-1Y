import java.util.*;
import java.util.stream.*;

class Invoice {
    int id;

    Invoice(int id) {
        this.id = id;
    }

    public String toString() {
        return "Invoice ID: " + id;
    }
}

public class InvoiceCreation {
    public static void main(String[] args) {

        List<Integer> ids = Arrays.asList(1, 2, 3, 4);

        List<Invoice> invoices = ids.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
