package RailwayTicketBooking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Booking {

    static ArrayList<Ticket> tickets = new ArrayList<>();
    static final int limit = 1;
    static int lowerBerth = 1;
    static int upperBerth = 1;
    static int middleBerth = 1;
    static int RACtck = 1;
    static int WLtck = 1;
    static int ticketNo = 1;
    static Queue<Ticket> RAC = new LinkedList<>();
    static Queue<Ticket> WL = new LinkedList<>();

    //For booking
    public static String Book(String name, int age, String gender, String child, String birthPreference) {
        if (age < 5) {
            return "No ticket needed for below 5 years";
        }
        //this is for aged person & child having female
        if (child.equalsIgnoreCase("Y") || age >= 60) {
            if (lowerBerth <= limit) {
                tickets.add(new Ticket(name, age, gender, child, birthPreference, ticketNo++, "L" + lowerBerth));
                return "Your ticket is booked successfully\nYour seat no is: L" + lowerBerth++ + "\n------------------------------";
            }
            //this is for lower prefered people
        } else if (birthPreference.equalsIgnoreCase("L") && lowerBerth <= limit) {
            tickets.add(new Ticket(name, age, gender, child, birthPreference, ticketNo++, "L" + lowerBerth));
            return "Your ticket is booked successfully\nYour seat no is: L" + lowerBerth++ + "\n------------------------------";
            //this is for middle prefered people
        } else if (birthPreference.equalsIgnoreCase("M") && middleBerth <= limit) {
            tickets.add(new Ticket(name, age, gender, child, birthPreference, ticketNo++, "M" + middleBerth));
            return "Your ticket is booked successfully\nYour seat no is: M" + middleBerth++ + "\n------------------------------";
            //this is for upper prefered people
        } else if (birthPreference.equalsIgnoreCase("U") && upperBerth <= limit) {
            tickets.add(new Ticket(name, age, gender, child, birthPreference, ticketNo++, "U" + upperBerth));
            return "Your ticket is booked successfully\nYour seat no is: U" + upperBerth++ + "\n------------------------------";
            //this is for all seats
        } else if (lowerBerth <= limit || middleBerth <= limit || upperBerth <= limit) {
            String seat = lowerBerth <= limit ? "L" : middleBerth <= limit ? "M" : "U";
            int no = seat.equals("L") ? lowerBerth++ : seat.equals("M") ? middleBerth++ : upperBerth++;
            tickets.add(new Ticket(name, age, gender, child, birthPreference, ticketNo++, seat + no));
            return "Your seat no is: " + seat + no + "\n------------------------------";
            //this for RAC
        } else if (RACtck <= limit) {
            Ticket t = new Ticket(name, age, gender, child, birthPreference, ticketNo++, "RAC" + RACtck);
            tickets.add(t);
            RAC.offer(t);
            return "Your ticket is booked on RAC\nYour seat no is: RAC" + RACtck++ + "\n------------------------------";
            //this is for WL
        } else if (WLtck <= limit) {
            Ticket t = new Ticket(name, age, gender, child, birthPreference, ticketNo++, "WL" + WLtck);
            tickets.add(t);
            WL.offer(t);
            return "Your ticket is booked on RAC\nYour seat no is: WL" + WLtck++ + "\n------------------------------";
        }
        return "Sorry there is no ticket available";
    }

    //For cancelling
    public static String Cancel(int Id) {
        for (Ticket t : tickets) {
            if (t.getTicketId() == Id) {
                String seatNo = t.getSeatNo();

                if (seatNo.startsWith("L")) {
                    lowerBerth--;
                } else if (seatNo.startsWith("M")) {
                    middleBerth--;
                } else if (seatNo.startsWith("U")) {
                    upperBerth--;
                }
                Ticket r = null;
                String tempSN = "";

                //this is for rac
                if (!RAC.isEmpty()) {
                    r = RAC.poll();
                    tempSN = r.getSeatNo();
                    r.setSeatNo(t.getSeatNo());
                    RACtck--;
                    System.out.println("RAC ticket Id " + r.getTicketId() + " is moved to" + " '" + t.getSeatNo() + "' " + "seat no. And");
                }

                //this for wl
                if(r != null && !WL.isEmpty()){
                    Ticket w = WL.poll();
                    w.setSeatNo(tempSN);
                    RACtck++;
                    WLtck--;
                    System.out.println("Waiting list ticket Id " + w.getTicketId() + ": your ticket is confirmed on RAC" + " '" + tempSN + "' " + "seat no. And" );
                }
                tickets.remove(t);
                return "Your ticket cancelled successfully";
            }
        }
        return "Ticket ID " + Id + " not found. Please check and try again.";
    }

    //For Display
    public static void Display() {
        for (Ticket t : tickets) {
            System.out.println(t);
        }
    }

    //For Available seats
    public static void AvailableSeats() {
        int lower = limit - lowerBerth + 1;
        int middle = limit - middleBerth + 1;
        int upper = limit - upperBerth + 1;
        int rac = limit - RACtck + 1;
        int wl = limit - WLtck + 1;

        int total = lower + middle + upper + rac + wl;

        System.out.println("+---------------+------------+");
        System.out.println("|   Berth Type  | Available  |");
        System.out.println("+---------------+------------+");
        System.out.printf("| Lower Berth   | %10d |\n", lower);
        System.out.printf("| Middle Berth  | %10d |\n", middle);
        System.out.printf("| Upper Berth   | %10d |\n", upper);
        System.out.printf("| RAC Tickets   | %10d |\n", rac);
        System.out.printf("| WL Tickets    | %10d |\n", wl);
        System.out.println("+---------------+------------+");
        System.out.printf("| Total Tickets | %10d |\n", total);
        System.out.println("+---------------+------------+");
    }

}