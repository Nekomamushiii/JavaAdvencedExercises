package listlyIterator;

import java.util.*;

public class ListyIterator<T> implements Iterable<ListyIterator>{
     private List<T> list;
     private int index;

    public ListyIterator(T[] elements) {
        this.list=Arrays.asList(elements);
        this.index=0;
    }
    public ListyIterator() {
        this.list=Arrays.asList();
        this.index=0;
    }

    public boolean hasNext(){
        return this.index<this.list.size()-1;
    };
    public boolean move() {
        if(hasNext()){
            this.index++;
            return true;
        }return false;
    }
    public void print() {
        if(this.list.isEmpty())
            throw new IllegalStateException("Invalid Operation!");
        System.out.println(this.list.get(index));
    }

    @Override
    public Iterator<ListyIterator> iterator() {
        return null;
    }

}
