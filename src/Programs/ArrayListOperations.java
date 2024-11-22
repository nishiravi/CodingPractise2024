package Programs;

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        // add items to array
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("kiwi");
        // print all elements
        System.out.println(fruits);

        // remove item
        fruits.remove("kiwi");
        fruits.remove(1);
        System.out.println(" after removing items"+fruits);

        // search an element
        if(fruits.contains("apple"))
        {
            System.out.println(" yes it contains the fruit");
        }

        // iterate over the list
        for(String fr:fruits)
        {
            System.out.println(fr);
        }

    }
}
