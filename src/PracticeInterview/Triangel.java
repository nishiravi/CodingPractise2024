package PracticeInterview;

public class Triangel {
    public static void main(String[] args) {
        System.out.println("Increasing triangle");
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------");
        System.out.println("Decreasing triangle");
        int j=5;
        for(int k=1;k<=j;k++)
        {
            for(int l=k;l<=j;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------");
        System.out.println("Pyramid");
        int a=5;
        for(int b=1;b<=a;b++)
        {
            for(int c=b;c<=a;c++)
            {
                System.out.print(" ");
            }
            for(int d=1;d<b;d++)
            {
                System.out.print("*");
            }
            for(int e=1;e<=b;e++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
