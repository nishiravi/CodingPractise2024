package Programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String data=sc.nextLine();
       System.out.println("input string    "+data);
        System.out.print("Reverse of string is    ");
        for(int i=data.length()-1;i>=0;i--)
        {
            System.out.print(data.charAt(i));
        }
    }
}
