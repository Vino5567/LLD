package NumberSystem;

public class floateven {
    public static void main(String[] args) {
        int n = 6;
        String s = "100.70";
        System.out.println(check(s, n));
    }

    static String check(String s, int n){
        int ans = 0;
        for (int i = n - 1; i > 0 ; i--) {
            if(s.charAt(i) == '.'){
                break;
            }
            ans = (ans * 10) + s.charAt(i) - '0';
        }

        if(ans % 2 == 0){
            return "EVEN";
        }
        return "ODD";
    }
}
