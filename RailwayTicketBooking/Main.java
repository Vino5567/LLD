package RailwayTicketBooking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Booking\n2.Cancel\n3.Ticket Details\n4.Available Tickets\n5.exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                String child = "N";
                String birthPreference = "L";

                sc.nextLine();
                System.out.print("Enter your name:");
                String name = sc.nextLine();
                System.out.print("enter your age:");
                int age = sc.nextInt();
                System.out.print("Enter your Gender( 'F' or 'M' ):");
                String gender = sc.next();
                if (gender.equalsIgnoreCase("F")) {
                    System.out.print("Are you have a child( 'Y' or 'N' ):");
                    child = sc.next();
                }
                if (age > 5 && age < 60 && child.equalsIgnoreCase("N")) {
                    System.out.print("enter your birth-preference( 'L' or 'M' or 'U' ):");
                    birthPreference = sc.next();
                }
//Calling booking fuction here
                System.out.println(Booking.Book(name, age, gender, child, birthPreference));
            }

            if (choice == 2) {
                System.out.println("Enter your tickt id:");
                int ticketId = sc.nextInt();
                System.out.println(Booking.Cancel(ticketId));
            }

            if (choice == 3) {
                System.out.println("+-----------------------------------------------------------+");
                System.out.println("| Tkt ID | Seat No | Name            | Age | Gender | Child |");
                System.out.println("+-----------------------------------------------------------+");

                Booking.Display();

                System.out.println("+-----------------------------------------------------------+");
            }

            if (choice == 4) {
                Booking.AvailableSeats();
            }

            if (choice == 5) {
                break;
            }
        }
    }
}
