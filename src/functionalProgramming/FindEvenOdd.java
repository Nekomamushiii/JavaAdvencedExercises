package functionalProgramming;

import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class FindEvenOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<String,Integer> parser = Integer::parseInt;
        String[] arr = scanner.nextLine().split("\\s+");
        String type=scanner.nextLine();
        int start = parser.apply(arr[0]);
        int end = parser.apply(arr[1]);

        for(int i=start;i<=end;i++)
            if(checkType.test(i,type)){
                System.out.print(i+" ");
            };

    }
    static BiPredicate<Integer,String> checkType = (num,type)->{
        if(type.equals("even"))
            return num % 2 == 0;
        else
            return num % 2 != 0;
    };
}
