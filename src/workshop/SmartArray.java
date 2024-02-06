package workshop;

import java.util.Arrays;
import java.util.function.Consumer;

public class SmartArray {
    private static final int INITIAL_CAPACITY =4;
    private int[] data;
    private int size;
    private int capacity;

    public SmartArray() {
        this.data=new int[INITIAL_CAPACITY];
        this.capacity=INITIAL_CAPACITY;
    }
    private void resize(){
        this.capacity*=2;
        int[] copyArray = new int[this.capacity];
        for(int i=0;i<this.data.length;i++)
            copyArray[i]=data[i];
        this.data=copyArray;
    }
    public void add(int element){
        if(this.size==this.capacity)
            this.resize();
        this.data[this.size++]=element;
    }
    public int get(int index){
       if(this.size<index)
           checkIndex(index);
       return this.data[index];
    }
    private void checkIndex(int index){
        if(index<0 || index>=this.size){
            String message = String.format("Index %d of out of bounds for length %dБуруу индекс",index,this.size);
            throw new IndexOutOfBoundsException(message);
        }
    }
    private void shift(int index){
        for(int i=index;i<this.size-1;i++)
            this.data[i]=this.data[i+1];
        this.data[size-1]=0;
    }
    private void shrink(){
        this.capacity/=2;
        int[] copy = new int[this.capacity];
        for(int i=0;i<this.data.length;i++)
            copy[i]=this.data[i];
        this.data=copy;
    }
    public int remove(int index){
        checkIndex(index);
        int element = this.data[index];
        shift(index);
        this.size--;
        if(this.size <= this.capacity / 4)
            shrink();
        return element;
    }
    private void shiftRight(int index){
        for(int i=this.size-1;i>index;i--)
            this.data[i]=this.data[i-1];
    }
    public void add(int index,int element){
        checkIndex(index);
        if(index == this.size-1){
            add(this.data[this.size-1]);
            this.data[this.size-2]=element;
        }else{
            this.size++;
            shiftRight(index);
            this.data[index]=element;
        }
    }
    public boolean contains(int element){
        for(int i=0;i<this.size;i++){
            if(data[i]==element)
                return true;
        }
        return false;
    }
    public void forEach(Consumer<Integer> consumer){
        for(int i=0;i<this.size;i++)
            consumer.accept(data[i]);
    }

}
