package com.ajet.module4.day29.additional;

/**
 * @Author prakashponali
 * @Date 11/11/23
 * @Description Problem Description Given a column title as appears in an Excel sheet, return its corresponding column
 * number.
 * <p>
 * <p>
 * <p>
 * Problem Constraints 1 <= length of the column title <= 5
 * <p>
 * <p>
 * <p>
 * Input Format The only argument is a string that represents the column title in the excel sheet.
 * <p>
 * <p>
 * <p>
 * Output Format Return a single integer that represents the corresponding column number.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * AB Input 2:
 * <p>
 * BB
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * 28 Output 2:
 * <p>
 * 54
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * A -> 1 B -> 2 C -> 3 ... Z -> 26 AA -> 27 AB -> 28 Explanation 2:
 * <p>
 * A -> 1 B -> 2 C -> 3 ... Z -> 26 AA -> 27 AB -> 28 ... AZ -> 52 BA -> 53 BB -> 54
 */
public class Excel_Column_Number {

    public static void main(String[] args) {
        Excel_Column_Number excelColumnNumber = new Excel_Column_Number();
        System.out.println(excelColumnNumber.getExcelColumnNumber("BB"));
    }


    public int getExcelColumnNumber(String A) {
        int result = 0;
        for(int i = 0; i < A.length(); i++){
            result = result * 26 + A.charAt(i) - 'A' + 1;
        }
        return result;
    }
}
