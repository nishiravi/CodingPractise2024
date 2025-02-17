package PracticeInterview.PracticeString;

public class StringBufferExample {


    //StringBuffer (not fastest, thread-safe)
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.append(" World"));// Modifies the same object
        System.out.println(sb.append(" java"));// Modifies the same object
        //System.out.println(sb); // Output: Hello World
    }

}
