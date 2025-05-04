package NumberSystem;

public class armstrong {
    public static void main(String[] args) {
        int ques = 153;
        boolean ans = armstrongNumber(ques);
        System.out.println(ans);
    }

        static boolean armstrongNumber(int n) {

            int m=n;
            int sum=0;
            while(n!=0){
                int a = n%10;
                sum = findCube(a) + sum;
                n=n/10;
            }
            return sum == m;
        }
        static int findCube(int a){
            return a*a*a;
        }
    }





//153 % 10 = 3
//153 / 10 = 15
