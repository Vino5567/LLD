package Zoho.set3;

import java.util.Arrays;

public class BiotonicGeneratorSort {
    public static void main(String[] args) {
        int[] arr = {13,2,4,15,12,10,5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j+=2) {
                if (arr[j] <= arr[j + 2]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 2];
                    arr[j + 2] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - 2; j+=2) {
                if (arr[j] >= arr[j + 2]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 2];
                    arr[j + 2] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

/*
Eg 1: Input: 13,2,4,15,12,10,5
        Output: 13,2,12,10,5,15,4
Eg 2: Input: 1,2,3,4,5,6,7,8,9
        Output: 9,2,7,4,5,6,3,8,1
*/
