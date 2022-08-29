package c1_RegEx.e1_simple_validation_username.e3;

public class Nessie {
    public static void main(String[] args) {
        System.out.println(isLockNessMonster("Your girlscout cookies are ready to ship. Your total comes to tree fiddy"));
        System.out.println(isLockNessMonster("Yo, I heard you were on the lookout for Nessie. Let me know if you need assistance."));
        System.out.println(isLockNessMonster("I'm from Scottland. I moved here to be with my family sir. Please, $3.50 would go a long way to help me find them"));
    }

    public static boolean isLockNessMonster(String s){
//        s.matches(".*(tree fiddy|three fifty|3.50).*")

//    return s.contains("tree fiddy") || s.contains("$3.50");
    return s.matches(".*(tree fiddy|three fifty|3.50).*");
    }

}
