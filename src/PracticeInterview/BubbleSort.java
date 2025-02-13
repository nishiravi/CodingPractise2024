package PracticeInterview;

import static Programs.BubbleSort.bubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {10, 3, 2, 5, 8};
        verifybubbleSort(data);
    }

    private static void verifybubbleSort(int[] data) {

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {

                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        for (int num : data) {
            System.out.println(num);

        }
    }
}
