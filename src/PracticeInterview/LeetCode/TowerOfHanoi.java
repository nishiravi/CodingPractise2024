package PracticeInterview.LeetCode;

public class TowerOfHanoi {
    public static void main(String[] args) {
        char source='S';
        char aux='H';
        char dest='D';
        int n=3;
        towerOfHani(n,source,aux,dest);
    }

    private static void towerOfHani(int n, char source, char aux,char dest ) {
        if(n==1)
        {
            System.out.println(source+" ---> "+dest);
            return;
        }
        // move n-1  from source to auxiliary
        towerOfHani(n-1,source,dest,aux);
        //move n disk to destination
        System.out.println(source+" ---> "+dest);
        towerOfHani(n-1,aux,source,dest);
    }
}

