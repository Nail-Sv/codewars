package e4_printer_errors;

public class Solution {
    public static void main(String[] args) {

//        printerError("aaabbbbhaijjjm");
        printerError("a");
    }

    public static String printerError(String s) {
        // your code
//        abcdefghijklm
//        for(char ch = 'a'; ch != 'n'; ch++){
//            System.out.print(ch);
//        }
        System.out.println(s);
        System.out.println(s.matches("abcdefghijklm"));
//        System.out.println(s.contains("abcdefghijklm"));

        return "";
    }
}
