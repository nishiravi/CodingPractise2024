package PracticeInterview.RecursivePrograms;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        towerOfHanoi(n - 1, from, aux, to); // Move n-1 disks to auxiliary
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        towerOfHanoi(n - 1, aux, to, from); // Move n-1 disks from auxiliary to target
    }

    public static void main(String[] args) {
        int n=3;
        towerOfHanoi(3, 'A', 'C', 'B'); // Output steps
    }
}

