package c2.Strings.a3;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortAndStar {
    public static void main(String[] args) {
        String[] input = new String[] {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"};
        System.out.println(twoSort(input));
    }

    public static String twoSort(String[] s) {

        return Arrays.stream(Stream.of(s)
                .sorted(String::compareTo)
                .toList().get(0).split(""))
                .map(String::valueOf)
                .collect(Collectors.joining("***"));
    }
}
