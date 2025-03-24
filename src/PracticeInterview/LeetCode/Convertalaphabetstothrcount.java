package PracticeInterview.LeetCode;

public class Convertalaphabetstothrcount {
    public static void main(String[] args) {

        String s = "aaabbccdaa";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <=s.length()-1; i++) {
            char currentchar=s.charAt(i);
            int count = 1;
            while(i+1<s.length() && s.charAt(i + 1)==currentchar) {
                count++;
                i++;
            }
         sb.append(currentchar).append(count);
        }
        System.out.println(sb.toString());
    }
}
