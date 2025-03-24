package PracticeInterview.AllProgram;

import java.util.Arrays;

public class MinMAxinArray {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        a[0][0] = 2;
        a[0][1] = 4;
        a[0][2] = 5;
        a[1][0] = 3;
        a[1][1] = 4;
        a[1][2] = 0;
        a[2][0] = 1;
        a[2][1] = 4;
        a[2][2] = 9;
        int min = a[0][0];
        int row=0;
        int col=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    row=i;
                    col=j;
                }
            }
        }
        System.out.println(min);
      //  System.out.println(row+" "+col);
        int max=a[row][col];
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i][col]>max)
            {
                max=a[i][col];
            }
        }
        System.out.println(max);
    }
}
