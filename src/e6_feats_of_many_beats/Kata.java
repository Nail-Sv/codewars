package e6_feats_of_many_beats;

public class Kata {
    public static void main(String[] args) {
        System.out.println(feast("great blue heron","garlic nann"));
        System.out.println(feast("chickadee","chocolate cake"));
        System.out.println(feast("brown bear","bear claw"));

    }

    public static boolean feast(String beast, String dish) {
        String first = String.valueOf(beast.charAt(0));
        String last = String.valueOf(beast.charAt(beast.length()-1));
    return dish.startsWith(first) && dish.endsWith(last);
    }
}
