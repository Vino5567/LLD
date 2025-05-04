package NumberSystem;

public class pow {

    public static void main(String[] args) {
        int q = 16;
        System.out.println(isPowerOfTwo(q));
    }
    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
