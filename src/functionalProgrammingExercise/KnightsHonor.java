package functionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class KnightsHonor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Consumer<List<String>> print = e->e.forEach(el-> System.out.println("Sir "+el));
        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        print.accept(list);
    }
}
