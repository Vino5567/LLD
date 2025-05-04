import java.time.LocalDate;

public class user {
    String name;
    String phno;
    int bookId;
    LocalDate buyDate;
    LocalDate returnDate;

    public user(String name, String phno, int bookId, LocalDate buyDate, LocalDate returnDate) {
        this.name = name;
        this.phno = phno;
        this.bookId = bookId;
        this.returnDate = returnDate;
        this.buyDate = buyDate;
    }

    public int getBookId() {
        return bookId;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }
}
