package NumberSystem;

public class leapYear {
    public static void main(String[] args) {
        int year = 2000;
        System.out.println(isLeap(year));
    }

    static boolean isLeap(int year){
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return true;
        }
        return false;
    }
}
