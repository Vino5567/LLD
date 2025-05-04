public class Book {
    int bookId;
    String title;
    String author;
    String type;
    int price;

    public Book(int bookId, String title, String author, String type, int price) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.price = price;
        this.bookId = bookId;
    }

    public int getBookId() {
        return bookId;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "Book ID: " +  bookId + "\nTitle: " + title + "\nauthor: " + author + "\ntype: " + type + "\nprice" + price + "\n----------------------";
    }
}
