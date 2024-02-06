package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Deque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue,scanner.nextLine().split("\\s+"));
        int n = scanner.nextInt();
        int circle = 1;
        while(queue.size()>1){
            for(int i=1;i<n;i++)
                queue.offer(queue.poll());
            if(isPrime(circle))
                System.out.printf("Prime %s\n",queue.peek());
            else
                System.out.printf("Removed %s\n",queue.poll());
           circle++;
        }
        System.out.println("Last is "+queue.peek());
    }
    static Boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
