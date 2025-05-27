package PracticeInterview.LeetCode;

public class GretaeLetterthantarget {
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/?utm_source=chatgpt.com
    public static void main(String[] args) {
        char[] letter = {'c', 'j', 'k', 'n','o'};
        char target = 'm';
        System.out.println(findGreater(letter, target));
    }

    //Linear search
//    public static char findgreater(char[] letter,char target)
//    {
//        for(int i=0;i<=letter.length-1;i++){
//                if(letter[i]>target)
//                {
//                    return letter[i];
//                }
//        }
//        return letter[0];
//    }
    public static char findGreater(char[] letter, char target) {
        int low = 0, high = letter.length - 1;
        int pos = 0;
        while (low <= high) {
            int mid = (high+low) / 2;

            if (letter[mid] > target) {
                pos = mid;
                high = mid - 1;  // Move left to find a smaller greater letter
            } else {
                low = mid + 1;   // Move right if letter[mid] <= target
            }
        }
        return pos == 0 ? letter[0] : letter[pos]; // Handle circular behavior
    }

}

