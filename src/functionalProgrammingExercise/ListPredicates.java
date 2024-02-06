package functionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;


public class ListPredicates {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        BiPredicate<Integer,int[]> isDiv = (num1,arrNum)->{
            for(int n : arrNum){
                if(num1%n!=0)
                    return false;
            }
            return true;
        };
        for(int i=1;i<=num;i++){
            if(isDiv.test(i,arr))
                System.out.print(i+" ");
        }
    }
}
