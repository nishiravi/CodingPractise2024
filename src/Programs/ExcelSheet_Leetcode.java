package Programs;

public class ExcelSheet_Leetcode {
    //https://leetcode.com/problems/excel-sheet-column-number/description/
    public static void main(String[] args) {

        String columnTitle="A";
        int result=0;
        for(char c:columnTitle.toCharArray())
        {
            int charvalue=c-'A'+1; // gives the numeric value of the alphabet in the Excel
            // Ex: c=A=65, 65-65+1=1;
            // c=B=66,66-65+1=2;
            result=result*26+charvalue;
        }
        System.out.println(result);
    }
}
