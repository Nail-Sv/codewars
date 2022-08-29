package e8_shifter_words;

import java.util.Set;
import java.util.TreeSet;

public class Shifter {
    public static void main(String[] args) {
//        System.out.println(count("OS IS UPDATED"));
//        System.out.println(count("ON"));
//        System.out.println(count("WHO IS WHO"));
//        System.out.println(count("JS"));
//        System.out.println(count("I III I III"));
        System.out.println(count(""));

    }

    public static int count(String st){
        String[] strArr = st.split(" ");
        String[] regArr = new String[]{"H", "I", "N", "O", "S", "X", "Z", "M", "W"};
        Set<String> set = new TreeSet<>();

        for (String s : strArr) {
            char[] word = s.toCharArray();
            int counter = 0;
            for (char ch : word){
                for (String str : regArr){
                    if (String.valueOf(ch).equals(str)){
                        counter++;
                    }
                }
            }
            if (counter == s.length() && s.length() != 0){
                set.add(s);
            }
        }

    return set.size();
    }
}
