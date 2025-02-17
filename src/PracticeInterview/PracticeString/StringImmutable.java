package PracticeInterview.PracticeString;

public class StringImmutable {

    //In Java, the String class is immutable,
    // meaning that every time you modify a string,
    // a new object is created in memory.

        public static void main(String[] args) {
            String str = "Hello";
            str = str + " World";  // Creates a new string "Hello World" instead of modifying "Hello"
            System.out.println(str); // Output: Hello World

        }
    }


