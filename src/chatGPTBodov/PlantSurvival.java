package chatGPTBodov;

import java.util.Scanner;
import java.util.Stack;

public class PlantSurvival {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] pesticides = new int[N];

        for (int i = 0; i < N; i++) {
            pesticides[i] = scanner.nextInt();
        }

        int days = findDaysToSurvive(pesticides);
        System.out.println(days);
    }

    private static int findDaysToSurvive(int[] pesticides) {
        Stack<Integer> stack = new Stack<>();
        int days = 0;

        for (int i = 0; i < pesticides.length; i++) {
            while (!stack.isEmpty() && pesticides[i] > pesticides[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty() || pesticides[i] <= pesticides[stack.peek()]) {
                stack.push(i);
            }
        }

        return stack.size();
    }
}
