package PracticeInterview.LeetCode;

public class FirstSecondLargestSmallest {
    public static void main(String[] args) {
        int[] arr={2,3,7,8,5,10,1,4};
        findLargest(arr);
        findSmallest(arr);
    }

    private static void findLargest(int[] arr) {

        for(int i=0;i<2;i++)
        {
            int largest=0;
            int j=0;
            while(j<arr.length-1-i)
            {
                if(arr[j]>arr[largest])
                {
                    largest=j;
                }
                j++;
            }
            int temp=arr[largest];
            arr[largest]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
            System.out.print( "largest " +arr[arr.length-1-i] +" ");
            System.out.println();
        }
    }
    private static void findSmallest(int[] arr) {

        for(int i=0;i<2;i++)
        {
            int smallest=i;
            int j=i+1;
            while(j<arr.length)
            {
                if(arr[j]<arr[smallest])
                {
                    smallest=j;
                }
                j++;
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
            System.out.println("Smallest " +arr[i] +" ");
        }
    }
}
