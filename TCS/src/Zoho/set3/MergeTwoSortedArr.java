package Zoho.set3;

import java.util.ArrayList;

public class MergeTwoSortedArr {
    public static void main(String[] args) {
        int[] Array1 = {2, 4, 5, 6, 7, 9, 10, 13};
        int[] Array2 = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15};
        int n1 = Array1.length - 1;
        int n2 = Array2.length - 1;

        System.out.println(merge(Array1, Array2, n1, n2));
    }

    public static ArrayList<Integer> merge(int[] arr1, int[] arr2, int n1, int n2){
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                list.add(arr1[i++]);
            } else if (arr1[i] > arr2[j]) {
                list.add(arr2[j++]);
            } else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }

        while (i < n1) {
            list.add(arr1[i++]);
        }

        while (j < n2) {
            list.add(arr2[j++]);
        }

        return list;
    }
}

/*
Eg 1: Input:
        Array 1: 2,4,5,6,7,9,10,13
        Array 2: 2,3,4,5,6,7,8,9,11,15
       Output:
       Merged array: 2,3,4,5,6,7,8,9,10,11,13,15
 */
