package c2.Strings.a1;

public class Solution {
    public static void main(String[] args) {
        String input = "8 j 8   mBliB8g  imjB8B8  jl  B";
        System.out.println(noSpace(input));

    }

    public static String noSpace(final String x) {


        return x.replaceAll(" ", "");
    }
}
