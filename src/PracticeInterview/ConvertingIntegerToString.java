package PracticeInterview;

public class ConvertingIntegerToString {
    public static void main(String[] args) {
//
//        Integer a=10;
//        String b=a.toString(); //integer to srting
//        System.out.println(b);
//        Integer n=Integer.parseInt(b);
//        System.out.println(n);

        int a=10;
        String b=String.valueOf(a); //Integer to srting-Primitives
        System.out.println(b);
        Integer n=Integer.parseInt(b);
        Integer d=Integer.valueOf(n);

    }
}
