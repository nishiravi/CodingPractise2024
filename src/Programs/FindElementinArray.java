package Programs;

import java.util.Arrays;
import java.util.List;

public class FindElementinArray {
    public static void main(String[] args) {
        Integer[] numbers={25,65,45};
        // Convert array into ArrayList
      List<Integer> numberArray  =Arrays.asList(numbers);
      // check if array has element 25
      System.out.println(numberArray.contains(25));
    }
}
