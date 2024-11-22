package Programs;

import java.util.LinkedHashSet;

public class MergeArray {
    public static void main(String[] args) {

        int[] arr1={1,2,3,8,7,9,};
        int[] arr2={5,1,10,3,89};
        mergeArray(arr1,arr2);
    }
    public static void mergeArray(int[] arr1,int[] arr2){
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int num:arr1) // add the elements of arr1 into the set
        {
            set.add(num);
        }
        for(int num: arr2){ // add elements of arr2 into the set, set will not add duplicates value
            set.add(num);
        }
        System.out.println("Merged array "+set);
    }
}
