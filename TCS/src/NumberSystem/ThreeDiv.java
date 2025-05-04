package NumberSystem;
import java.util.ArrayList;
public class ThreeDiv {
    public static void main(String[] args) {
        int q = 2;
        ArrayList<Long> ques = new ArrayList<>();
        ques.add(6L);
        ques.add(10L);
        System.out.println(threeDivisors(ques, q));
    }
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q){
        ArrayList<Integer>result=new ArrayList<>();
        for(long queries:query){
            int count=0;
            for(int i=2;(long)i*i<=queries;i++){
                if(isPrime(i)){
                    count++;
                }
            }
            result.add(count);
        }
        return result;
    }
    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
