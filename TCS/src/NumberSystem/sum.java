package NumberSystem;

public class sum {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        System.out.println(Sum(num));
    }

    static int Sum(int[] arr){
        int ans = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
                ans = ans + arr[i];
        }
        return ans;
    }
}
