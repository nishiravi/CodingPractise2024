package PracticeInterview.AllProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob","Nishi", "Charlie");
        names.sort(Comparator.naturalOrder());
        System.out.println("Ascending order is "+names);
        names.sort(Comparator.reverseOrder());
        System.out.println("Descending order is "+names);
    }
}
