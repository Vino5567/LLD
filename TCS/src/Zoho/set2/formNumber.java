package Zoho.set2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class formNumber {
    public static void main(String[] args) {
        int n = 5;
        Queue<String> queue = new LinkedList<>();
        queue.offer("3");
        queue.offer("4");

        ArrayList<String> result = new ArrayList<>();
        while(result.size() < n) {
            String temp = queue.poll();
            result.add(temp);
            queue.offer(temp + "3");
            queue.offer(temp + "4");
        }
        System.out.println(result);

    }
}



/*
The numbers are: 3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444, 3333, 3334, 3343, 3344, 3433, 3434, 3443, 3444 ….
 */