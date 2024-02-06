package genericsCountMethodString;

import java.util.ArrayList;
import java.util.List;

public class CountMethodString<T extends Comparable<T>> {
    private List<T> list;

    public CountMethodString() {
        this.list=new ArrayList<>();
    }
    public void add(T element){
        this.list.add(element);
    }
    public int count(T element){
        int count=0;
        for(T t:this.list){
            if(element.compareTo(t)<0)
                count++;
        }
        return count;
    }
}
