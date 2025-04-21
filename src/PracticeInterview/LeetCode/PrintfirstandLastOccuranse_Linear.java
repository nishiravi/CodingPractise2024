package PracticeInterview.LeetCode;

public class PrintfirstandLastOccuranse_Linear {
    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 4, 5, 5, 8};
        int target = 5;
        System.out.println("first occurance " + linerSearchFirstOccurance(arr, target));
        System.out.println("last occurance " + linerSearchLastOccurance(arr, target));

    }

    public static int linerSearchFirstOccurance(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            while (arr[i] == target) {
                if (i == 0 || arr[i-1] != arr[i]) {
                    return i;
                } else {
                    i--;
                }
            }
        }
        return -1;
    }
    public static int linerSearchLastOccurance(int[] arr, int target) {
        for (int j = 0; j < arr.length - 1; j++) {
            while (arr[j] == target) {
                if (j==arr.length-1 ||arr[j+1] != arr[j]) {
                    return j;
                } else {
                    j++;
                }
            }
        }
        return -1;
    }
}


