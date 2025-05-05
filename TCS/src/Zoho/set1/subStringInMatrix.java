package Zoho.set1;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class subStringInMatrix {
    public static void main(String[] args) {
        String s = "HELLOWORLDJAVADEVELOPER";
        String check = "JAVA";
        int n = s.length();
        int len = check.length();
        int row = (int) Math.ceil(sqrt(n));
        char[][] matrix = new char[row][row];

        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (count < n) {
                    matrix[i][j] = s.charAt(count++);
                } else {
                    matrix[i][j] = ' '; // fill remaining with space
                }
            }
        }

        // Print the 2D matrix
        System.out.println("2D Matrix:");
        for (char[] r : matrix) {
            for (char c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        boolean found = false;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (matrix[i][j] == check.charAt(0)) {
                    if (j <= row - len) {
                        if (checkRight(matrix, check, i, j)) {
                            System.out.println("Found Left-to-Right");
                            System.out.println("Start index: <" + i + "," + j + ">");
                            System.out.println("End index: <" + i + "," + (j + len - 1) + ">");
                            found = true;
                        }
                    }
                    if (i <= row - len) {
                        if (checkDown(matrix, check, i, j)) {
                            System.out.println("Found Top-to-Bottom");
                            System.out.println("Start index: <" + i + "," + j + ">");
                            System.out.println("End index: <" + (i + len - 1) + "," + j + ">");
                            found = true;
                        }
                    }
                }
            }
        }

        if (!found) {
            System.out.println("Substring not found.");
        }
    }

    public static boolean checkRight(char[][] mat, String word, int i, int j) {
        for (int k = 0; k < word.length(); k++) {
            if (mat[i][j + k] != word.charAt(k)) return false;
        }
        return true;
    }

    public static boolean checkDown(char[][] mat, String word, int i, int j) {
        for (int k = 0; k < word.length(); k++) {
            if (mat[i + k][j] != word.charAt(k)) return false;
        }
        return true;
    }
}

/*
Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search for substring like “too” in the two dimensional string both from left to right and from top to bottom.

w    e    L    C    O
M    E    T    O    Z
O    H    O    C    O
R    P    O    R    A
T    I    O    n
And print the start and ending index as Start index : <1,2> End index: <3, 2>
*/
