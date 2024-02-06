package workshopExercise;

public class Test {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
        doubleLinkedList.addLast(54);
        doubleLinkedList.addFirst(1);
        doubleLinkedList.addFirst(2);
        doubleLinkedList.addFirst(3);
        System.out.println(doubleLinkedList.get(2));
        doubleLinkedList.forEach(System.out::println);
    }
}
