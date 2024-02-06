package functionalProgrammingExercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Function<Integer,Integer> add = e -> e+1;
        Function<Integer,Integer> multiply = e->e*2;
        Function<Integer,Integer> subtract = e->e-1;
        Consumer<Integer> print = e->System.out.print(e+" ");
        String comm = scanner.nextLine();
        while (!comm.equals("end")){
            switch (comm){
                case "add":
                    list.replaceAll(add::apply);break;
                case "multiply": list.replaceAll(multiply::apply);break;
                case "subtract":list.replaceAll(subtract::apply);break;
                case "print": list.forEach(print);
                    System.out.println(); break;
            }
            comm=scanner.nextLine();
        }

    }
}
