package stackQueueExercise;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static long[] fibonacciCache;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        fibonacciCache=new long[n+1];
        System.out.println(getFibonacci(n));
    }
    static long getFibonacci(int n){
        if(n==1 || n==0) {
            return 1;
        }
        if(fibonacciCache[n]!=0)
            return fibonacciCache[n];
        long fibonacci = getFibonacci(n-1)+getFibonacci(n-2);
        fibonacciCache[n]=fibonacci;

        return fibonacci;
    }
}
