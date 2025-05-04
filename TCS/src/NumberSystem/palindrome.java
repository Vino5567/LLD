package NumberSystem;

public class palindrome {
    public static void main(String[] args) {
        int ques = 123;
        boolean ans = isPalindrome(ques);
        System.out.println(ans);
    }

    public static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;

        while(n>0){
            int digit = n%10;
            rev = (rev*10) + digit;
            n = n/10;
        }
        if(rev==temp){
            return true;
        }
        else{
            return false;
        }
    }
}

