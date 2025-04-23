package PracticeInterview.LeetCode;

public class ReverseEachWordInSentence {
    public static void main(String[] args) {
        String data = "java is fun";
        reverseSentence(data);
        //Using stringBuilder
//        String[] arr = data.split(" ");
//        for (int i = 0; i <= arr.length - 1; i++) {
//            StringBuilder sb = new StringBuilder(arr[i]);
//            String result = sb.reverse().toString();
//            System.out.print(result + " ");
//        }
    }

    public static void reverseSentence(String data) {
        String[] words=data.split(" ");
        String reverseString="";
        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            String temp="";
            for(int j=0;j<word.length();j++)
            {
                temp=word.charAt(j)+temp;
            }
            reverseString=reverseString+temp+ " ";
        }
     System.out.println(data);
        System.out.println(reverseString);
    }

}

