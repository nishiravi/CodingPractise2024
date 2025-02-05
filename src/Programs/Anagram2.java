package Programs;

public class Anagram2 {
        public static void main(String[] args) {
            String str1 = "listen";
            String str2 = "silent";

            if (isAnagram(str1, str2)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }

        public static boolean isAnagram(String str1, String str2) {
            // If lengths are not equal, they can't be anagrams
            if (str1.length() != str2.length()) {
                return false;
            }

            // Create frequency arrays for characters (assuming lowercase English letters)
            int[] count1 = new int[26]; // For str1
            int[] count2 = new int[26]; // For str2

            // Count occurrences of each character
            for (int i = 0; i < str1.length(); i++) {
                count1[str1.charAt(i) - 'a']++;
                count2[str2.charAt(i) - 'a']++;
            }

            // Compare character frequencies
            for (int i = 0; i < 26; i++) {
                if (count1[i] != count2[i]) {
                    return false;
                }
            }
            return true;
        }
    }


