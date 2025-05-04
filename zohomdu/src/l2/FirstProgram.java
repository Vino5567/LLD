package l2;

public class FirstProgram {
    public static void main(String[] args) {
        int n = 5;
        int s = 1;
        for (int i = 1; i <= n; i++) {
            int ss = s;
            int a = n - 1;
            for (int j = 1; j < i + 1; j++) {
                System.out.print(ss + " ");
                ss += a--;
            }
            System.out.println();
            ++s;
        }
    }
}
