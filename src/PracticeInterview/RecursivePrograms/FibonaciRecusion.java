package PracticeInterview.RecursivePrograms;

public class FibonaciRecusion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {

        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);

    }

}
