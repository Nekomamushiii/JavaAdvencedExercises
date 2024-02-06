package stackQueueExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Deque<Integer> num = new ArrayDeque<>();
        int[] inputNum = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        for (int j : inputNum) {
            num.push(j);
        }
        while(!num.isEmpty())
            System.out.print(num.pop()+" ");
    }
}
