package e1_toCamelCase;

public class toCamelCase {

    public static void main(String[] args) {

        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
    }

    static String toCamelCase(String s){
        char[] changedArr = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < changedArr.length; i++){

            if (changedArr[i] != '-' && changedArr[i] != '_'){
                stringBuilder.append(changedArr[i]);
            }else {
                stringBuilder.append(String.valueOf(changedArr[i+1]).toUpperCase());
                i++;
            }
        }
        return stringBuilder.toString();
    }
}
