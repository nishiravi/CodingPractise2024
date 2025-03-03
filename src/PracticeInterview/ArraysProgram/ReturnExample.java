package PracticeInterview.ArraysProgram;

public class ReturnExample {
    public static void main(String[] args) {
        int[][] list = {{1, 3}, {4, 5}, {2, 6}};
        int v = 8;
        int[] result = searchvalueinthelist(list, v);
        if (result == null) {
            System.out.println(" not found");
        } else {
            System.out.println(result[0] + "," + result[1]);
        }
    }

    public static int[] searchvalueinthelist(int list[][], int v) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == v) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
