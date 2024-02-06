package functionalProgrammingExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ReverseExclude {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Consumer<List<Integer>> print = e-> System.out.println(e.toString().replaceAll("[\\[\\],]",""));
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int divisible = Integer.parseInt(scanner.nextLine());
        list.removeIf(e ->e%divisible==0);
        Collections.reverse(list);
        print.accept(list);
    }

}
