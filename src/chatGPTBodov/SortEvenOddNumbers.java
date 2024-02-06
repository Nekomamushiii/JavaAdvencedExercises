package chatGPTBodov;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortEvenOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers (space-separated): ");
        String input = scanner.nextLine();

        String[] numberStrings = input.split(" ");
        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }

        // Custom comparator to sort even numbers before odd numbers
        Comparator<Integer> evenOddComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                boolean num1IsEven = num1 % 2 == 0;
                boolean num2IsEven = num2 % 2 == 0;

                // If both numbers have the same parity, sort them in ascending order
                if (num1IsEven == num2IsEven) {
                    return num1.compareTo(num2);
                }

                // Sort even numbers before odd numbers
                return num1IsEven ? -1 : 1;
            }
        };

        // Sort the numbers using the custom comparator
        Integer[] boxedNumbers = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedNumbers, evenOddComparator);

        // Print the sorted result
        System.out.print("Sorted numbers: ");
        for (int num : boxedNumbers) {
            System.out.print(num + " ");
        }
    }
}
