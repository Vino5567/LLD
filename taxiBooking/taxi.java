package taxiBooking;

public class taxi {
    private int taxiNo;
    private char taxiLocation = 'A';
    private char pickupLocation;
    private char dropLocation;
    private int dropTime;
    private int earnings;

    taxi(int taxiNo){
        this.taxiNo = taxiNo;
    }

    public int getDropTime() {
        return dropTime;
    }

    public void setDropTime(int dropTime) {
        this.dropTime = dropTime;
    }

    public char getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(char pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public char getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(char dropLocation) {
        this.dropLocation = dropLocation;
    }

    public void setTaxiNo(int taxiNo) {
        this.taxiNo = taxiNo;
    }

    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }

    public void setTaxiLocation(char taxiLocation) {
        this.taxiLocation = taxiLocation;
    }

    public int getEarnings() {
        return earnings;
    }

    public char getTaxiLocation() {
        return taxiLocation;
    }

    public int getTaxiNo() {
        return taxiNo;
    }


}
