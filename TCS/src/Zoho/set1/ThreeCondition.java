package Zoho.set1;

import java.util.ArrayList;
import java.util.List;

public class ThreeCondition {
    public static void main(String[] args) {
        int[] ques = {10, 36, 54,89,12};
        ArrayList<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < ques.length; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(ques[i]);
            int sum = perfectSquare(ques[i]) + div(ques[i]) + ifEven(ques[i]);
            list.add(sum);
            result.add(list);
        }
        System.out.println(result);
    }

    public static int perfectSquare(int num){
        int s = 1;
        int e = num / 2;

        while(s < e){
            int mid = (s + e) / 2;
            if(mid * mid == num) return 5;
            else if (mid * mid < num) s = mid + 1;
            else e = mid - 1;
        }
        return 0;
    }

    public static int div(int num){
        if(num % 6 == 0 && num % 4 == 0) return 4;
        return 0;
    }

    public static int ifEven(int num){
        if(num % 2 == 0) return 3;
        return 0;
    }
}

/*
Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions:
1. 5 if a perfect square
2. 4 if multiple of 4 and divisible by 6
3. 3 if even number
And sort the numbers based on the weight and print it as follows <10,its_weight>,<36,its weight><89,its weight> Should display the numbers based on increasing order.
*/
