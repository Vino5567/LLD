public class BS {
    public static void main(String[] args) {
        int[] ques = {1,2,3,4,5,7,8,9,10};
        int f = 7;
        System.out.println(find(ques, f));
    }

    private static int find(int[] ques, int f) {
        int left = 0;
        int right = ques.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(ques[mid] == f){
                return mid;
            }else if (ques[mid] <= f) {
                left = mid + 1;

            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
