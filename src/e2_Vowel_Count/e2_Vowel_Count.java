package e2_Vowel_Count;

public class e2_Vowel_Count {
    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
    }

    public static int getCount(String str) {
        int counter = 0;
        char[] toCount = str.toCharArray();

        for (char c : toCount){
            if ("aeiouAEIOU".indexOf(c) != -1){
                counter++;
            }
        }

        return counter;
    }
}
