package PracticeInterview.LeetCode;

public class TowerOfHanoi {
    public static void main(String[] args) {
        char source='1';
        char aux='2';
        char dest='3';
        int n=3;
        towerOfHani(n,source,dest,aux);
    }

    private static void towerOfHani(int n, char source, char dest, char aux) {
        if(n==1)
        {
            System.out.println("move disk 1 from source  "+source+"to destination "+dest);
            return;
        }
        // move n-1  from source to auxillay
        towerOfHani(n-1,source,aux,dest);
        //move n disk to destination
        System.out.println("move disk  from source  "+source+"to destination "+dest);
        towerOfHani(n-1,aux,dest,source);
    }
}

