package PracticeInterview.LeetCode;

public class NumberSegmentsString {
    //https://leetcode.com/problems/number-of-segments-in-a-string/description/
    public static void main(String[] args) {
        String s = ", , , ,        a, eaefa";
        int count = countSegments(s);
        System.out.print(count);
    }

    private static int countSegments(String s) {
        int count = 0;
        if (s.length() == 0) {
            return 0;
        }
        String[] words = s.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        return count;
    }
//    public int countSegments(String s) {
//        if(s==null|| s.trim().isEmpty()){
//            return 0;
//        } else {
//            String[] words=s.trim().split("\\s+");
//            return words.length;
//        }
    //}
}
