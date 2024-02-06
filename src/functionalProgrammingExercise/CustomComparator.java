package functionalProgrammingExercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Comparator<Integer> sorArr = (a,b)->{
            if(a%2==0 && b%2!=0)
                return -1;
            else if(b%2==0&&a%2!=0)
                return 1;
            return a.compareTo(b);
        };
        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArr,sorArr);
        System.out.println(Arrays.toString(boxedArr).replaceAll("[\\[\\],]",""));
    }
}
