package NumberSystem;

import java.util.ArrayList;
import java.util.List;

public class swap {
    public static void main(String[] args) {
        int a = 13;
        int b = 9;
        System.out.println(ans(a, b));
    }

    static List<Integer> ans(int a,int b)
    {
        List<Integer> list=new ArrayList<>();
        a=a+b;
        b=a-b;
        a=a-b;
        list.add(a);
        list.add(b);

        return list;

    }
}
