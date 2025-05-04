import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while(loop){

            System.out.println("1.user\n2.management\n3.exit");
            int role = sc.nextInt();

            if(role == 1){
                while(true){
                    System.out.println("1.Rent\n2.return");
                    int ch = sc.nextInt();
                    if(ch == 1) {
                        if(Management.books.size() == 0){
                            System.out.println("there is no book in our library!!");
                            break;
                        }else{
                        Management.display();
                        System.out.println("Enter Book Id For Rent:");
                        int idBuy = sc.nextInt();
                        if (Management.isAvl(idBuy)) {
                            System.out.println("Enter your name:");
                            String usrName = sc.next();
                            System.out.println("Enter ph.no:");
                            String phno = sc.next();
                            System.out.println(Management.rent(usrName, phno, idBuy));
                            System.out.println("Want to rent another book: (Y/N)");
                            String bookCh = sc.next();
                            if (bookCh.equalsIgnoreCase("N")) break;
                        } else {
                            System.out.println("Invalid id!!");
                        }
                        }
                    }else if(ch == 2){
                        System.out.println("Enter id:");
                        int id = sc.nextInt();

                        System.out.println("Enter return Date(YYYY-MM-DD):");
                        String Date = sc.next();
                        LocalDate retDate = LocalDate.parse(Date);

                        System.out.println(Management.returnBook(id,retDate));
                    }
                }
            }

            if(role == 2){
                while(true){
                    System.out.println("1.Add book\n2.Remove book\n3.Change Role\n4.Display Available Books");
                    int addRmv = sc.nextInt();

                    if (addRmv == 1) {
                        System.out.println("Enter a Book Id:");
                        int bookId = sc.nextInt();
                        System.out.println("Enter a Book title:");
                        String title = sc.next();
                        System.out.println("Enter a Book author:");
                        String author = sc.next();
                        System.out.println("Enter a Book type:");
                        String type = sc.next();
                        System.out.println("Enter a Book price:");
                        int price = sc.nextInt();
                        System.out.println(Management.addBook(bookId, title, author, type, price));
                    }
                    if (addRmv == 2) {
                        System.out.println("Enter Id to Remove:");
                        int rmvId = sc.nextInt();
                        System.out.println(Management.rmvBook(rmvId));
                    }
                    if (addRmv == 3) {
                        break;
                    }
                    if (addRmv == 4) {
                        Management.display();
                    }
                }
            }

            if(role == 3){
                break;
            }

        }
    }
}