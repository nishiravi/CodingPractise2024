package PracticeInterview.AllProgram;

public class PrintNumbersTriangle {
    public static void main(String[] args) {
        int k = 1;
        int n = 4;
        for (int i = 0; i < n; i++,k=1) {
            for (int j = 0; j < i; j++) {
                System.out.print(k+" " );
                k++;
            }
            System.out.println();
        }
    }
}
