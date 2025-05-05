package Zoho.set1;

public class pattern {
    public static void main(String[] args) {
        String s = "PROGRAM";
        int n = s.length();
        int mid = n / 2;
        int spaceBetween = (n - 2);

        for (int i = 0; i < n; i++) {
            int left = (i <= mid) ? i : n - 1 - i;
            int right = (i <= mid) ? n - 1 - i : i;

            // Print leading spaces
            printSpaces(left);

            // Print left character
            System.out.print(s.charAt(left));

            // Middle line prints only one character
            if (left != right) {
                printSpaces(spaceBetween);
                System.out.print(s.charAt(right) );
            }

            // Adjust spacing between characters
            if (i < mid) {
                spaceBetween -= 2;
            } else {
                spaceBetween += 2;
            }
            System.out.println();
        }
    }

    static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
}

/*
P         M
 R      A
   O  R
     G
  O    R
 R       A
P          M
*/