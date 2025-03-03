package PracticeInterview.ArraysProgram;

public class SearchElementInArray {
    public static void main(String[] args) {
        int[][] list = {{1, 3}, {4, 5}, {2, 6}};
        int searchvalue = 4;
        int positionX = -1;
        int positionY = -1;
        parent_loop:
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchvalue) {
                    positionX = i;
                    positionY = j;
                    break parent_loop;
                }
            }
        }
        if (positionX == -1 || positionY == -1) {
            System.out.println(" value not found");
        } else {
            System.out.println(" value  found");
        }
    }
}
