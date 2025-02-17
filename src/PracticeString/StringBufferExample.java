package PracticeString;

public class StringBufferExample {

    String hello;
    public StringBufferExample(String hello) {
        this.hello=hello;
    }

    //StringBuilder (fastest, non-thread-safe)
    public static void main(String[] args) {
        StringBufferExample sb = new StringBufferExample("Hello");
        System.out.println(sb.append(" World"));
        System.out.println(sb.append(" java"));// Modifies the same object
        //System.out.println(sb); // Output: Hello World
    }

    public String append(String s) {
        return hello=hello+s;
    }

}
