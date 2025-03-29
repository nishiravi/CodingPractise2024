package PracticeInterview.LeetCode;

public class LongestSubstringNoRepeat_NOTFINISHED {
    //https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
    public static void main(String[] args) {

        String str="xabcabdca";
        int start=0;
        int end=1;
        int maxlength=1;
        while(end<str.length()+1) {
            int newPos = end + 1;
            int k = str.substring(start,end+1).lastIndexOf(str.charAt(newPos));
            if (k==-1) { // char not found in prev substring
                end++;
                if(maxlength<end-start)
                    maxlength = end-start;
            } else {
                start = k+1;
                end++;
            }
        }
        System.out.println(maxlength);
    }
}
