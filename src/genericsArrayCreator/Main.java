package genericsArrayCreator;

public class Main {
    public static void main(String[] args) {
       String[] str = ArrayCreator.create(10,"test");
       Integer[] arr = ArrayCreator.create(Integer.class,10,1);
    }
}
