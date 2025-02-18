package PracticeInterview.AllProgram;

public class PrimeNumber {

    public static void main(String[] args) {
        int n=7;
        System.out.println(isprime(n));
    }

    public static boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        else if(n==2 || n==3)
        {
            return true;
        }
        else if(n%2==0)
        {
            return false;
        }
        for(int i=3;i<n/2;i+=2)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
