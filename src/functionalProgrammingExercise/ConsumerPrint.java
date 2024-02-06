package functionalProgrammingExercise;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      //  List<String> list = Arrays.stream(scanner.nextLine().split("\\s+")).toList();
       // Consumer<List<String>> print = e->e.forEach(System.out::println);
       //print.accept(list);
        Consumer<String> print = System.out::println;
        for(String s : scanner.nextLine().split("\\s+" )){
            print.accept(s);
        }
    }
}
