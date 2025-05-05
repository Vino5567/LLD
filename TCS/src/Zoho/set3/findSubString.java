package Zoho.set3;

public class findSubString {
    public static void main(String[] args) {
        String s1 = "testing123";
        String s2 = "1234";
        int n1 = s1.length();
        int n2 = s2.length();
        System.out.println(check(s1, s2, n1, n2));
    }

    public static int check(String s1, String s2, int n1, int n2) {
        for (int i = 0; i <= n1 - n2; i++) {
            int j = 0;
            while (j < n2 && s1.charAt(i + j) == s2.charAt(j)) {
                j++;
            }
            if (j == n2) {
                return i;
            }
        }
        return -1;
    }
}

/*
Eg 1:Input:
        String 1: test123string
         String 2: 123
        Output: 4
Eg 2: Input:
        String 1: testing12
        String 2: 1234
        Output: -1
 */
