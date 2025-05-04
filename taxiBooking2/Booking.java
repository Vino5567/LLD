package taxiBooking2;

import java.util.ArrayList;

public class Booking {
    static ArrayList<Taxi> taxi = new ArrayList<>();

    static int limit = 2, taxiId = 0;

    public static String TaxiBooking(char pickup, char drop, int time){
        if(taxi.size() < limit){
            taxi.add(new Taxi(++taxiId));
        }

        Taxi ready = null;
        int nearest = Integer.MAX_VALUE;
        int minEranings = Integer.MAX_VALUE;

        for(Taxi t : taxi){
            int distance = Math.abs(pickup - t.getCurrentLocation());

            if(t.getDropTime() < time){
                if(distance < nearest || (distance == nearest && t.getEarnings() <= minEranings)){
                    nearest = distance;
                    minEranings = t.getEarnings();
                    ready = t;
                }
            }
        }

        if(ready != null) {
            int distance = Math.abs(pickup - drop);
            int eranings = distance * 15 * 10 + 50;
            ready.setEarnings(eranings);
            ready.setDropTime(ready.getDropTime() + distance);
            ready.setCurrentLocation(drop);
        }

        return ready != null? "Taxi " + ready.getId() + " is Booked for You": "Sorry, There is no taxi available";
    }

    public static void DisplayTaxiDetails(){
        for(Taxi t : taxi){
            System.out.println("Taxi No: " + t.getId());
            System.out.println("Taxi Location: " + t.getCurrentLocation());
            System.out.println("Total Earnings: " + t.getEarnings());
            System.out.println("Available at: " + t.getDropTime());
            System.out.println("--------------------------------");
        }
    }
}
