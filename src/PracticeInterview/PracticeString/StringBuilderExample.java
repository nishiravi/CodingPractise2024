package PracticeInterview.PracticeString;

public class StringBuilderExample {


    //StringBuilder (fastest, non-thread-safe)-Modifying a string without creating an object
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" World");// Modifies the same object
        System.out.println(sb);
        sb.append(" java");// Modifies the same object
        System.out.println(sb);
        sb.reverse();
        System.out.println("reverse of a string is  : " +sb);
    }

}
