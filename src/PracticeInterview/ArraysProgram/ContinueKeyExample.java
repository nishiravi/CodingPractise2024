package PracticeInterview.ArraysProgram;

public class ContinueKeyExample {
    public static void main(String[] args) {
        parent_Loop:
        for (char stable = 'a'; stable <= 'd'; stable++) {
            for (int lepord = 1; lepord <= 3; lepord++) {
                if (stable == 'b' || lepord == 2) {
                    continue parent_Loop;
                }
                System.out.println("Cleaning: " + stable + "," + lepord);
            }

        }
    }
}
