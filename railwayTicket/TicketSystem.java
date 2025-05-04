package railwayTicket;

import java.util.*;

public class TicketSystem {

    private static List<Passenger> Bookings = new ArrayList<>();

    private static int ticketNo = 1;
    private static Queue<Passenger> RAC = new LinkedList<>();
    private static int RACSize = 2;
    private static Queue<Passenger> WaitingList = new LinkedList<>();
    private static int WL = 2;

    private static int LowerBerth = 2;
    private static int MiddleBerth = 1;
    private static int UpperBerth = 1;

    private static int SeatLowerBerth = 1;
    private static int SeatMiddleBerth = 1;
    private static int SeatUpperBerth = 1;
    private static int RACSeat = 1;
    private static int WLSeat = 1;



    public static void booking(String name, int age, String gender, String berth, String child){
        if(age > 60 || child.equals("Yes")){
            if(LowerBerth > 0){
                int ticketId = ticketNo++;
                String seat = SeatLowerBerth++ + "L";
                LowerBerth--;
                Passenger p = new Passenger(name, age, gender, berth, seat, ticketId);
                Bookings.add(p);
                System.out.println("Due to some your comfortable reason your seat is assinged to Lower Berth");
                System.out.println("Confirmed Your Preferred Ticket: " + p);
            }else{
                System.out.println("LowerBerth is unavailable");

            }
        }else if(berth.equals("L") && LowerBerth > 0 || berth.equals("M") && MiddleBerth > 0 || berth.equals("U") && UpperBerth > 0){
            int ticketId = ticketNo++;
            String seat = "";
            if(berth.equals("L")){
                seat = SeatLowerBerth++ + "L";
                LowerBerth--;
            }else if(berth.equals("M")){
                seat = SeatMiddleBerth++ + "M";
                MiddleBerth--;
            }else{
                seat = SeatUpperBerth++ + "U";
                UpperBerth--;
            }

            Passenger p = new Passenger(name, age, gender, berth, seat, ticketId);
            Bookings.add(p);
            System.out.println("Confirmed Your Preferred Ticket: " + p);

        }else if(LowerBerth > 0 || MiddleBerth > 0 || UpperBerth > 0){
            if(LowerBerth > 0){
                int ticketId = ticketNo++;
                String seat = "";
                seat = SeatLowerBerth++ + "L";
                LowerBerth--;
                Passenger p = new Passenger(name, age, gender, berth, seat, ticketId);
                Bookings.add(p);
                System.out.println("Your preferred seat unavailable. So, Confirmed Your Ticket at different seat: " + p);
            }else if(MiddleBerth > 0){
                int ticketId = ticketNo++;
                String seat = "";
                seat = SeatMiddleBerth++ + "M";
                MiddleBerth--;
                Passenger p = new Passenger(name, age, gender, berth, seat, ticketId);
                Bookings.add(p);
                System.out.println("Your preferred seat unavailable. So, Confirmed Your Ticket at different seat: " + p);
            }else{
                int ticketId = ticketNo++;
                String seat = "";
                seat = SeatUpperBerth++ + "U";
                UpperBerth--;
                Passenger p = new Passenger(name, age, gender, berth, seat, ticketId);
                Bookings.add(p);
                System.out.println("Your preferred seat unavailable. So, Confirmed Your Ticket at different seat: " + p);
            }
        }else if(RAC.size() < RACSize){
            int ticketId = ticketNo++;
            String seat = RACSeat +"RAC";
            RACSeat++;
            Passenger p = new Passenger(name, age, gender, berth, seat, ticketId);
            RAC.offer(p);
            Bookings.add(p);
            System.out.println("Your preferred ticket unavailable,So your ticket moved to RAC: " + p);
        } else if (WaitingList.size() < WL){
            int ticketId = ticketNo++;
            String seat = WLSeat + "WL";
            WLSeat++;
            Passenger p = new Passenger(name, age, gender, berth, seat, ticketId);
            WaitingList.offer(p);
            Bookings.add(p);
            System.out.println("Your preferred ticket ans RAC tickets are unavailable,So your ticket moved to Waiting List: " + p);
        } else{
            System.out.println("Sorry, There is no tickets available");
        }

    }

    public static void cancel(int ticketId){
        Optional<Passenger> cancel = Bookings.stream()
                .filter(p -> p.getTicketNo() == ticketId)
                .findFirst();
        if(cancel.isPresent()){
            Passenger p = cancel.get();
            Bookings.remove(p);
            String available = p.getSeat();

            if(!RAC.isEmpty()) {
                Passenger rac = RAC.poll();
                Bookings.remove(rac);
                RACSeat--;
                rac.setSeat(available);
                int racTicketNo = rac.getTicketNo();
                Bookings.add(rac);
                System.out.println("RAC Ticket: " + racTicketNo + " is moved to -> " + available);
                System.out.println("Ticket confirmed for you:" + rac);
            }

            if (!WaitingList.isEmpty()) {
                Passenger wl = WaitingList.poll();
                Bookings.remove(wl);
                int wlTicketNo = wl.getTicketNo();
                if (RAC.size() < RACSize) {
                    RAC.offer(wl);
                    RACSeat++;
                }
                wl.setSeat(RAC.size() + "RAC");
                Bookings.add(wl);
                WLSeat--;
                System.out.println("Waiting List Ticket: " + wlTicketNo + " is moved to -> " + RAC.size() + "RAC");
                System.out.println("Ticket confirmed to RAC:" + wl);
            }
                System.out.println("----------------------- \nYour ticket cancelled successfully");

        }else{
            System.out.println("There is no such ticket booked");
        }

    }

    public static void display(){
        if(Bookings.isEmpty()){
            System.out.println("There is no ticket booked");
        }
        System.out.println("-----------------------");
        for(Passenger p : Bookings){
            System.out.println(p);
        }
        System.out.println("Total Tickets Booked" + Bookings.size());
    }

    public static void availableSeat(){
        System.out.println("-----------------------");
        System.out.println("LowerBerth: " + LowerBerth);
        System.out.println("MiddleBerth: " + MiddleBerth);
        System.out.println("UpperBerth: " + UpperBerth);
        int rac = RACSize - RAC.size();
        System.out.println("RAC: " + rac);
        int wl = WL - WaitingList.size();
        System.out.println("Waiting List: " + wl);
        int total = LowerBerth+MiddleBerth+UpperBerth+rac+wl;
        System.out.println("Total available Tickets:" + total);
    }
}


