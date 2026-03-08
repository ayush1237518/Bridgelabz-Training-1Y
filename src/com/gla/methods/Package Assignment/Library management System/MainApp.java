
import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class MainApp {

    public static void main(String[] args) {

        Book b = new Book();
        Member m = new Member();
        Transaction t = new Transaction();

        b.addBook();
        m.registerMember();
        t.issueBook();
    }
}
