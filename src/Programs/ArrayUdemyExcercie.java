package Programs;

import java.awt.*;

// reverse of the elements in the array , and find total number of elements present in the array
public class ArrayUdemyExcercie {
    public static void main(String[] args) {
        int[] numbers={2,3,4,8,9};
        int totalElement=0;
        System.out.println(numbers[0]+ " <-- first element");
        System.out.println(numbers[numbers.length-1]+"<-- last element");
        System.out.println(" Reverse order of elements ");
        for(int i= numbers.length-1;i>=0;i--)
        {
            System.out.println(numbers[i]);
            totalElement++;
        }
        System.out.println(" total elements in array is  "+totalElement);
    }
}
