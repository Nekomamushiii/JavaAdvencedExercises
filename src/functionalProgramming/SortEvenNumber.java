package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class SortEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consumer<List<Integer>> print = num -> System.out.println(num.toString().replaceAll("[\\[\\]]",""));
        List<Integer> num = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        num.removeIf(e->e%2!=0);
        print.accept(num);
        num.sort(Integer::compare);
        print.accept(num);
    }
}
