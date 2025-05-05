package Zoho.set2;

import java.util.Arrays;

public class AlternativeSorting {
    public static void main(String[] args) {
        int[] ques = {7, 1, 2, 3, 4, 5, 6};
        Arrays.sort(ques);
        int n = ques.length;

        int i = 0, j = n - 1;
        while (i < j) {
            System.out.print(ques[j--] + " ");
            System.out.print(ques[i++] + " ");
        }

        if (n % 2 != 0)
            System.out.print(ques[i]);
    }
}
