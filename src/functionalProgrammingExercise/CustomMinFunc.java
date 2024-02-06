package functionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunc {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<int[],Integer> getMin = e-> Arrays.stream(e).min().getAsInt();
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println(getMin.apply(arr));
    }
}
