package Zoho.set3;

public class printVariable {
    public static void main(String[] args) {
        String s = "b3c6d15";
        char a = ' ';
        int i = 0;
        while (i < s.length()) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                a = s.charAt(i);
                i++;
            }else{
                int j = i;
                int n = 0;
                while( j < s.length() && (s.charAt(j) - '0' >= 0 && s.charAt(j) - '0' <= 9)){
                    n = (n * 10) + (s.charAt(j) - '0');
                    j++;
                    i++;
                }
                print(a,n);
            }
        }
    }
    public static void print(char a, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(a);
        }
    }
}

/*
Eg 1: Input: a1b10
       Output: abbbbbbbbbb
Eg: 2: Input: b3c6d15
          Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.
 */
