package e5_list_filtering;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static void main(String[] args) {

//        System.out.println(filterList(List.of(1, 2, "a", "b")));
        System.out.println(filterList(List.of(1, 2, "a", "b", 0, 15)));
//        filterList(List.of(1, 2, "a", "b"));
    }

    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
//        var copiedList = new ArrayList<Object>();
        List<Object> copiedList = new ArrayList<>();
        for (Object item : list) {
            if (item instanceof Integer){
                copiedList.add((int)item);
            }
        }
        return copiedList;
    }
}
