package genericsListUtilies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<String> listStr = new ArrayList<>();
        list.add(10);
        list.add(23);
        list.add(35);
        list.add(34);
        Collections.addAll(listStr,"a","b","E");
        System.out.println(ListUtilities.getMin(list));
        System.out.println(ListUtilities.getMax(listStr));
        System.out.println(ListUtilities.getMin(listStr));


    }
}
