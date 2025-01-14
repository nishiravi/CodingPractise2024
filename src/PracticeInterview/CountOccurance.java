package PracticeInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurance {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String data=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char a:data.toCharArray())
        {
            if(map.containsKey(a))
            {
                map.put(a,map.get(a)+1);
            }
            else
                map.put(a,1);
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
