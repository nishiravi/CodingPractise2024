package PracticeInterview.LeetCode;

public class RhombusPattern {
    public static void main(String[] args) {
        int n = 3; // You can change this value to generate a larger rhombus
        printRombus(n);
    }

    private static void printRombus(int n) {

        for(int i=1;i<=n;i++)
        {
            printrow(i,n);
        }
        for(int i=n-1;i>=1;i--)
        {
            printrow(i,n);
        }
    }

    private static void printrow(int i, int n) {

        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print(j);
        }
        for(int j=i-1;j>=1;j--)
        {
            System.out.print(j);
        }
        System.out.println();
    }
}
