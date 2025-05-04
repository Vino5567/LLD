package NumberSystem;

import java.util.ArrayList;

public class prime {
    public static void main(String[] args) {
        int q = 2;
        ArrayList<Long> ques = new ArrayList<>();
        ques.add(6L);
        ques.add(10L);
        System.out.println(threeDivisors(ques , q));
    }
        static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q){
            ArrayList<Integer> res = new ArrayList<>();

            for(Long qu:query){
                int count=0;
                for(int i=2;i*i<=qu;i++){
                    if(isPrime(i)) count++;
                }
                res.add(count);
            }
            return res;
        }

        static boolean isPrime(int n){

            for(int i=2; i*i <= n;i++){
                if(n%i==0) return false;
            }
            return true;

        }


}
