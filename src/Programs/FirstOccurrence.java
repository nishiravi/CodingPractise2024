package Programs;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,4,5};
        int target=4;
        FirstOccurrence.testbinarySearch(arr,target);
    }
    public static  int testbinarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;  // target found
            } else if (arr[mid] < target) {
                left = mid + 1;  // target is in the right half
            } else {
                right = mid - 1;  // target is in the left half
            }
        }

        return -1;  // target not found
    }
}

