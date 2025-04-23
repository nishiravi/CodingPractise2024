package PracticeInterview.LeetCode;

public class ReverseString {
    public static void main(String[] args) {
        String s="java";
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        System.out.print(sb.toString());
    }

    // To reverse entire sentence
//    public static void main(String[] args) {
//        String data = "java is fun";
//        StringBuilder sb = new StringBuilder(data);
//        System.out.print(sb.reverse().toString());;
//
//    }
}
