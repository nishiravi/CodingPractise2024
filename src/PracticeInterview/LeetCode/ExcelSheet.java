package PracticeInterview.LeetCode;

public class ExcelSheet {
    //https://leetcode.com/problems/excel-sheet-column-title/description/
    public static void main(String[] args) {
        int columnNumber=28;
       String title = convertToTitle(columnNumber);
       System.out.println(title);

    }

    private static String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        while (columnNumber != 0) {
            columnNumber--; // adjust to 0-based
            int temp = columnNumber % 26;
            char alpha = (char) ('A' + temp); // get corresponding char
            sb.append(alpha); // build in reverse
            columnNumber /= 26;// move to next digit
        }
         return sb.reverse().toString();
    }
}
