package taxiBooking;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        boolean loop = true;

        Scanner sc = new Scanner(System.in);

        while(loop){
            System.out.println("-----------------\n1.Taxi Booking \n2.Exit \n3.Taxi Details");
            int userInput = sc.nextInt();
            if(userInput == 1){
                System.out.println("Enter the Pickup Location");
                char pickUp = sc.next().charAt(0);
                System.out.println("Enter the Drop Location");
                char drop = sc.next().charAt(0);
                System.out.println("Enter the Pickup Time");
                int time = sc.nextInt();
                System.out.println(Booking.taxiBooking(pickUp, drop, time));
            }else if(userInput == 2){
                loop = false;
                System.out.println("Thank You...!");
            }else if(userInput == 3){
                Booking.display();
            }else{
                System.out.println("Enter the Valid Input");
            }
        }

    }
}
