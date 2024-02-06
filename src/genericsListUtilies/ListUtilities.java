package genericsListUtilies;

import java.util.List;

public class ListUtilities {
    public static <T extends Comparable<T>> T getMin(List<T> list) {
        if(list.size() == 0)
            throw new IllegalArgumentException();
        T min = list.get(0);
        for(int i=1;i<list.size();i++){
            if(list.get(i).compareTo(min) < 0)
                min = list.get(i);
        }
        return min;
    }
    public static <T extends Comparable<T>> T getMax(List<T> list){
        if(list.size()==0)
            throw new IllegalArgumentException();
        T max = list.get(0);
        for(int i=1;i<list.size();i++){
            if(list.get(i).compareTo(max) > 0)
                max=list.get(i);
        }
        return max;
    }
}
