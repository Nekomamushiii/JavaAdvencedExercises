package stackQueueExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class BasicQueueOp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Deque<Integer> queue = new ArrayDeque<>();
        Deque<Integer> newQueue = new ArrayDeque<>();
        int min = Integer.MAX_VALUE;
        boolean bna =false;
        int[] comm = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] num = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        for(int i=0;i<comm[0];i++){
            queue.add(num[i]);
        }
        for(int i=0;i<comm[1];i++)
            queue.poll();
        while(!queue.isEmpty()){
            if(queue.peek()==comm[2])
                bna=true;
            newQueue.add(queue.poll());
        }
        if(bna)
            System.out.println("true");
        else{
            if(newQueue.isEmpty())
                System.out.println("0");
            else{
                while(!newQueue.isEmpty()){
                    if(newQueue.peek()<min)
                        min=newQueue.peek();
                    queue.add(newQueue.poll());
                }
                System.out.println(min);
            }
        }

    }
}
