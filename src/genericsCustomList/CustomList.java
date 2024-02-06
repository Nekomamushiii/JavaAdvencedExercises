package genericsCustomList;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> list;

    public CustomList() {
        this.list=new ArrayList<>();
    }
    public void add(T element){
        this.list.add(element);
    }
    public T remove(int index){
        return this.list.remove(index);
    }
    public boolean contains(T element){
        return this.list.contains(element);
    }
    public void swap(int index1,int index2){
        T el = this.list.get(index1);
        this.list.set(index1,this.list.get(index2));
        this.list.set(index2,el);
    }
    public int count(T element){
        int count=0;
        for(T t:this.list){
            if(element.compareTo(t)<0)
                count++;
        }
        return count;
    }
    public T getMax(){
        T max = this.list.get(0);
        for(int i=1;i<list.size();i++){
            if(max.compareTo(list.get(i))<0)
                max=list.get(i);
        }
        return max;
    }
    public T getMin(){
        T min = this.list.get(0);
        for(int i=1;i<list.size();i++){
            if(min.compareTo(list.get(i))>0)
                min=list.get(i);
        }
        return min;
    }
    public void print(){
        this.list.forEach(System.out::println);
    }
}
