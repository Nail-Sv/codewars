package e7_well_ideas;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Kata {
    public static void main(String[] args) {
        System.out.println(well(new String[] {"bad", "bad", "bad"}));

    }

    public static String well(String[] x) {
        int counter = 0;

        for (String item : x) {
            if (item.equals("good")){
                counter++;
            }
        }

        if (counter >= 1 && counter <= 2){
            return "Publish!";
        }
        else if (counter > 2) {
            return "I smell a series!";
        }else {
            return "Fail!";
        }
    }
}
