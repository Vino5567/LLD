import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


public class Management {
    static ArrayList<Book> permbooks = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();

    static ArrayList<user> users = new ArrayList<>();

    public static String addBook(int bookId, String name,String author,String type,int Price){
        books.add(new Book(bookId, name, author, type, Price));
        permbooks.add(new Book(bookId, name, author, type, Price));
        return "book is added!";
    }
    public static String rmvBook(int id){

        for(Book b : books){
            if(b.getBookId() == id){
             books.remove(b);
             return "removed!";
            }
        }
        return "Id not Exist";
    }
    public static boolean isAvl(int id){
        for(Book b : books){
            if(b.getBookId() == id){
                return true;
            }
        }
        return false;
    }

    public static String rent(String name,String ph,int id){
        LocalDate buyDate = LocalDate.now();
        LocalDate retDate = buyDate.plusDays(10);

        users.add(new user(name,ph,id,buyDate,retDate));
        rmvBook(id);
        return "successfully rented!!";
    }
    public static void display(){
        for(Book b : books){
            System.out.println(b);
        }
    }

    public static String returnBook(int id, LocalDate retDate){
        int rate = 0;
        for(Book b : permbooks) {
            if (b.getBookId() == id) {
                books.add(b);
                rate += b.getPrice();
                break;
            }
        }

        for(user u : users){
            if(u.getBookId() == id){
                if(u.getReturnDate().isBefore(retDate)) {
                    long late = ChronoUnit.DAYS.between(u.getReturnDate(),retDate);

                    if(late > 10){
                        int extraDays =(int) (late - 10);
                        rate += (extraDays*10);
                    }
                }
            }
        }
        System.out.println("your due cost:"+ rate);
        return "thanks for visiting!!";
    }

}
