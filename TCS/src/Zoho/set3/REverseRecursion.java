package Zoho.set3;

public class REverseRecursion {
    public static void main(String[] args) {
        String s = "one two three";
        System.out.println(reverse(s));
    }

    public static String reverse(String s) {
        if (s.isEmpty()) {
            return "";
        }

        int spaceIndex = s.indexOf(' ');
        if (spaceIndex == -1) {
            return s;
        }

        String firstWord = s.substring(0, spaceIndex);
        String rest = s.substring(spaceIndex + 1);

        return reverse(rest) + " " + firstWord;
    }
}

/*
Eg 1: Input: one two three
      Output: three two one
Eg 2: Input: I love india
      Output: india love I
 */
