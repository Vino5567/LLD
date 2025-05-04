package NumberSystem;

import java.util.ArrayList;
import java.util.List;

public class perfectNo {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(find(n));
    }

    public static List<Integer> find(int n){
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n/2; i++) {
            if(n % i == 0){
                sum += i;
                ans.add(sum);
            }
        }
        ans.add(n);

        return ans;
    }
}
