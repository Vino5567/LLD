package ArrayAndString;
public class SecondLargestEle {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(find(arr));
    }
    private static int find(int[] arr){
        int n=arr.length;
        if(n<2) return -1;

        int firstlarge=Integer.MIN_VALUE;
        int secondlarge=Integer.MAX_VALUE;

        for(int num:arr)
        {
            if(num>firstlarge)
            {
                secondlarge=firstlarge;
                firstlarge=num;
            }
            else if(num>secondlarge && num!=firstlarge)
            {
                secondlarge=num;
            }
        }
        return (secondlarge==Integer.MIN_VALUE)?-1:secondlarge;
    }
}
