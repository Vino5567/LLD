package l2;

import java.util.ArrayList;

public class SecondProgram {
    public static void main(String[] args) {
        int[] arr = {99, 89, 79, 69, 59};
        System.out.println(replaceElements(arr));
    }

    public static ArrayList<Integer> replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            } else
                arr[i] = max;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i += 2) {
            ans.add(arr[i]);
        }
        return ans;
    }
}



