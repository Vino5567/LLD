package taxiBooking;

import java.util.ArrayList;

public class Booking {
    private static ArrayList<taxi> taxi = new ArrayList<>();
    private static int limit = 2, taxiNo = 1;
//    private static ArrayList<Booking> bookings = new ArrayList<>();

    public static String taxiBooking(char pickup, char drop, int time) {

        if(taxi.size() < limit){
            taxi.add(new taxi(taxiNo++));
        }

        int min = Integer.MAX_VALUE;
        taxi ready = null;

        for(taxi t : taxi){
            if(t.getDropTime() <= time && Math.abs(pickup - t.getTaxiLocation()) < min){
                ready = t;
            }
        }

        if(ready != null){
            ready.setTaxiLocation(drop);
            ready.setPickupLocation(pickup);
            ready.setDropLocation(drop);
            ready.setDropTime(time + Math.abs(pickup - drop) );
            ready.setEarnings(ready.getEarnings() + Math.abs(pickup - drop)*100 );
        }

        return ready!=null?"TaxiNo:" +ready.getTaxiNo() + " is Booked for you": "Sorry no taxi available";
    }

    static void display(){
        for(taxi t : taxi){
            System.out.println("-----------------");
            System.out.println("TaxiNo:" + t.getTaxiNo());
            System.out.println("TaxiLocation:" + t.getTaxiLocation());
            System.out.println("This Taxi Earned:" + t.getEarnings());
        }

    }
}
