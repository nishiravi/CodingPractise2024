package Programs;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseOrderofFibonacci {
    public static void main(String[] args) {
        int num = 5;
        int first=0, second=1;
        ArrayList<Integer> data=new ArrayList<>();
        data.add(first);
        data.add(second);
        for(int i=2;i<num;i++)
        {
            int next=first+second;
            data.add(next);
            first=second;
            second=next;
        }
        System.out.println(data);
        Collections.sort(data,Collections.reverseOrder());
        System.out.println("reverse order is  "+data);


    }
}
