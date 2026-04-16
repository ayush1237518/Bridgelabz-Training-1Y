import java.time.*;
import java.util.*;

public class TransactionLogging {
    public static void main(String[] args) {

        List<Integer> ids = Arrays.asList(101, 102, 103);

        ids.forEach(id ->
                System.out.println(LocalDateTime.now() + " - Transaction: " + id));
    }
}
