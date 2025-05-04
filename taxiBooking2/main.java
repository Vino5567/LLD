package taxiBooking2;

import java.util.Scanner;

import static taxiBooking2.Booking.TaxiBooking;
import static taxiBooking2.Booking.DisplayTaxiDetails;


public class main {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);

        while (loop) {
            System.out.println("1.Book a Taxi\n2.Taxi Details\n3.Booking Details\n4.Exit");
            int choices = sc.nextInt();

            if(choices == 1){
                System.out.println("Enter pickup location:");
                char pickUp = sc.next().toUpperCase().charAt(0);
                System.out.println("Enter drop location:");
                char drop = sc.next().toUpperCase().charAt(0);
                System.out.println("Enter pickup time:");
                int time = sc.nextInt();

                System.out.println(TaxiBooking(pickUp, drop, time));
                System.out.println("------------------------------");

            }
            if(choices == 2){
                DisplayTaxiDetails();
            }
            if(choices == 3){

            }
            if(choices == 4){
                loop = false;
                break;
            }
        }

    }
}
