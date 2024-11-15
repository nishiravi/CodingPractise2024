package Programs;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {

        String str1 = "Listen";
        String str2 = "Silent";
        if (checkAnagaram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }


    public static boolean checkAnagaram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] array1 = str1.toLowerCase().toCharArray();
        char[] array2 = str2.toLowerCase().toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return (Arrays.equals(array1, array2));
    }
}
