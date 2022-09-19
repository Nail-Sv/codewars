package c2.Strings.a2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AbbreviateTwoWords {
    public static void main(String[] args) {
        String input = "Sam Harris";
        System.out.println(abbrevName(input));

    }

    public static String abbrevName(String name) {

        return Stream.of(name.split(" "))
                .map(word -> String.valueOf(word.charAt(0)).toUpperCase())
                .collect(Collectors.joining("."));
    }
}
