package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Deque<String> queue= new ArrayDeque<>();
        Collections.addAll(queue,scanner.nextLine().split("\\s+"));
        int n = scanner.nextInt();
        while(queue.size()>1){
            for(int i=1;i<n;i++)
                queue.offer(queue.poll());
            System.out.printf("Removed %s\n",queue.poll());
        }
        System.out.println("Last is "+queue.peek());
    }
}
