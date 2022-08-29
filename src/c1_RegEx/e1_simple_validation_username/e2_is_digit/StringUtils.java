package c1_RegEx.e1_simple_validation_username.e2_is_digit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println("Ret " + isDigit("a5"));
        System.out.println("Ret " + isDigit("14"));
        System.out.println("Ret " + isDigit("7"));
        System.out.println("Ret " + isDigit(" "));
        System.out.println("Ret " + isDigit(""));

    }

    public static boolean isDigit(String s) {
        String regEx = "[0-9]";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(s);
//        if (s.equals("")) return false;
    return matcher.matches();
    }
}
