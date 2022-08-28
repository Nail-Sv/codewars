package e3_Sum_of_odd_numbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Ret = " + rowSumOddNumbers(5));
    }

    public static int rowSumOddNumbers(int n) {
        int sum = 0;
        int countOfNums = 0;
        int num = 1;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            for (int j = 0; j < n; j++){
                list.add(num);
                num += 2;
            }
            countOfNums = countOfNums + i;
        }
        for (int i = countOfNums-1; i >= countOfNums - n; i--){
//            System.out.println(list.get(i));
            sum += list.get(i);
        }

        for (int i = 1; i <= (n)*3; i++){
            System.out.println(num);
//            list.add(num);
            num += 2;
        }








//        num = n;
//        num = num * num * num;


        return num;
    }
}
