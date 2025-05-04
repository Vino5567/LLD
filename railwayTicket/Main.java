package railwayTicket;

import java.util.Scanner;

import static railwayTicket.TicketSystem.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        while(loop){
            System.out.println("-----------------------");
            System.out.println("1.Book Ticket \n2.Cancel Ticket \n3.Booked Details \n4.Check Availability \n0.Exit");
            System.out.print("Enter Your Option:");
            int option = sc.nextInt();

            switch(option){
                case 1:{
                    String child = "No";
                    System.out.println("Enter Your Name:");
                    String name = sc.next();
                    System.out.println("Enter Your Age:");
                    int age = sc.nextInt();
                    System.out.println("Enter Your gender('M' or 'F'):");
                    String gender = sc.next();
                    if(gender.equals("F")){
                        System.out.println("Do You Have Child: (Yes or No)");
                        child = sc.next();
                    }
                    System.out.println("Enter Your Preferred berth('L' or 'M' or 'U')");
                    String berth = sc.next();
                    booking(name, age, gender, berth, child);
                    break;
                }

                case 2:{
                    System.out.println("Enter your ticketId to cancel your ticket");
                    int ticketId = sc.nextInt();
                    cancel(ticketId);
                    break;
                }

                case 3:{
                    System.out.println("Confirmed Tickets are:");
                    TicketSystem.display();
                    break;
                }

                case 4:{
                    System.out.println("Available Tickets are:");
                    TicketSystem.availableSeat();
                    break;
                }

                case 0:{
                    loop = false;
                    break;
                }

                default:{
                    System.out.println("You entered Invalid option");
                    break;
                }
            }
        }
    }
}
