package genericsSwapMethodStrings;

import java.util.ArrayList;
import java.util.List;

public class SwapMethodStrings<T> {
    private List<T> list;

    public SwapMethodStrings() {
        this.list = new ArrayList<>();
    }
    public void add(T element){
        this.list.add(element);
    }
    public void swap(int index1, int index2){
        T el = this.list.get(index1);
        this.list.set(index1,this.list.get(index2));
        this.list.set(index2,el);
    }

    public void printToString() {
        for(int i=0;i<this.list.size();i++)
            System.out.println(this.list.get(i).getClass().getName()+" : "+this.list.get(i));
    }
}
