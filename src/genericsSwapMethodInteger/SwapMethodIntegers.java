package genericsSwapMethodInteger;

import java.util.ArrayList;
import java.util.List;

public class SwapMethodIntegers<T> {
    private List<T> list;

    public SwapMethodIntegers() {
        this.list=new ArrayList<>();
    }
    public void add(T element){
        this.list.add(element);
    }
    public void swap(int index1,int index2){
        T el = this.list.get(index1);
        this.list.set(index1,list.get(index2));
        this.list.set(index2,el);
    }
    public void toPrint(){
        for(int i=0;i<this.list.size();i++)
            System.out.println(list.get(i).getClass().getName()+" : "+this.list.get(i));
    }
}
