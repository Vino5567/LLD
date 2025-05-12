package RailwayTicketBooking;

public class Ticket extends Passenger{
    int ticketId;
    String seatNo;

    public Ticket(String name, int age, String gender,String child, String birthPreference, int ticketId, String seatNo) {
        super(name, age, gender, child, birthPreference);
        this.ticketId = ticketId;
        this.seatNo = seatNo;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getSeatNo() {
        return seatNo;
    }

    @Override
    public String toString() {
        return String.format(
                "| %-6s | %-7s | %-15s | %-3d | %-6s | %-5s |",
                ticketId, seatNo, name, age, gender.toUpperCase(), child.toUpperCase()
        );
    }
}