package Programs;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={100,300,800,200,500,900,400};
        System.out.println("original array");
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("sorted  array");
        for(int n:arr)
        {
            System.out.print(n+" ");
        }

    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)break;
        }
    }
}
