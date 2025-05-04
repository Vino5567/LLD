package NumberSystem;

public class DivOrNot {
    public static void main(String[] args) {
        double ques = 3635883959606670431112222D;
        System.out.println(Div(ques));
    }

    static boolean Div(double a){
        long ans = 0;

        while(a!=0){
            double mod = a%10;
            ans += mod;
            a /= 10;
        }
        ans = ans % 9;

        if(ans == 0){
            return true;
        }
            return false;
    }
}
