package functionalProgrammingExercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSmallestEl {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>,Integer> findSmallest = arr -> {
            Integer min = arr.stream().min(Comparator.naturalOrder()).get();
            return arr.lastIndexOf(min);
        };
        System.out.println(findSmallest.apply(list));
    }
}
