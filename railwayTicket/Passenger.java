package railwayTicket;

public class Passenger {
    private int ticketNo;
    private String name;
    private int age;

    public void setSeat(String seat) {
        this.seat = seat;
    }

    private String gender;
    private String berth;
    private String seat;

    public String getSeat() {
        return seat;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public Passenger(String name, int age, String gender, String berth, String seat, int ticketNo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.berth = berth;
        this.seat = seat;
        this.ticketNo = ticketNo;
    }

    @Override
    public String toString(){
        System.out.println("-----------------------");
        return "\n TicketId: " + ticketNo + "\n name: " + name + "\n age: " + age + "\n gender: " + gender + "\n your Seat: " + seat;
    }
}