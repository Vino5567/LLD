package NumberSystem;

public class powx {
    public static void main(String[] args) {
        double x = 2.10000;
        int n = 3;
        System.out.println(myPow(x,n));

    }

    public static double myPow(double x, int n) {
        double ans = 1.0;
        long nn = n;

        if(n < 0) nn = -1 * nn;

        while(nn > 0){
            if(nn % 2 == 1){
                ans = ans * x;
                nn = nn - 1;
            }else{
                x = x * x;
                nn = nn / 2;
            }
        }

        if(n < 0) ans = (double) (1.0) / ans;
        return ans;
    }
}
