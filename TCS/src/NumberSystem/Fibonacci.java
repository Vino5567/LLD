package NumberSystem;

class Fibonacci {
    public static void main(String[] args) {
        int a = 7;
        System.out.println(fibo(a));
    }

    public static int fibo(int n){
        int a = 0;
        int b = 1;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = a + b;
            a = b;
            b = ans;
        }
        return a;
    }













//    public static int fibo(int a){
//        if(a < 2){
//            return a;
//        }
//        return fibo(a - 1) + fibo( a - 2);
//    }
}



