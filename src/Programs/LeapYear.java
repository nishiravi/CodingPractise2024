package Programs;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2068;
        boolean isLeapyear = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapyear = true;
        }
        if (isLeapyear == true)
            System.out.println(year + "   its a leap year");
        else
            System.out.println(year + "   its a  not leap year");

    }
}
