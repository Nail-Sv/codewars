package c1_RegEx.e1_simple_validation_username;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZywOo {
    public static void main(String[] args) {

//        System.out.println(validateUsr("regex"));
        System.out.println(validateUsr("regex"));
    }

    public static boolean validateUsr(String s) {
        Pattern pattern = Pattern.compile("[a-z0-9_]*");
        Matcher matcher = pattern.matcher(s);
        if (s.length() < 4) return false;
        if (s.length() > 16) return false;

//        System.out.println("Result " + matcher.matches());

    return matcher.matches();
    }
}
