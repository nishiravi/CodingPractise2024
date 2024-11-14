package Programs;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseOrderofFibonacci {
    public static void main(String[] args) {
        int num = 10;
        ArrayList<Integer> a=new ArrayList<>();
        int first = 0, second = 1, sumofSeries = 1;
        a.add(0,first);
        a.add(1,second);
        System.out.println(" fibonacci series");
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < num; i++) {
            int next = first + second;
            if (next >= 10)
                break;
            a.add(next);
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        System.out.println();
        System.out.println(" reverse of fibonacci series is ");
        Collections.sort(a,Collections.reverseOrder());
        for(int data: a)
        {
            System.out.print(data+" ");
        }

    }
}
