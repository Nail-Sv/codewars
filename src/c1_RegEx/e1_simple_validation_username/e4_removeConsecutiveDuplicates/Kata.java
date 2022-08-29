package c1_RegEx.e1_simple_validation_username.e4_removeConsecutiveDuplicates;

public class Kata {
    public static void main(String[] args) {
//        "alpha beta gamma delta alpha beta gamma delta"
        System.out.println(removeConsecutiveDuplicates("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
    }
    public static String removeConsecutiveDuplicates(String s){
        String regex = "\\b(\\w+)\\b\\s*(?=.\\b\\1\\b)";
//        String result =  s.replaceAll(regex, "");
        String result =  s.replaceAll(regex, "$1");

//        return result.trim().replaceAll("\\b\\s{1,}", " ");
        return result;
    }
}
