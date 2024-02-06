package ExamPrepation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class OSPlanning {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> queue = new ArrayDeque<>();
        int[] task = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] threads = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int taskKill = Integer.parseInt(scanner.nextLine());
        for (int j : task) stack.push(j);
        for(int j: threads) queue.add(j);
        while(true){
            if(!queue.isEmpty() && !stack.isEmpty()){
                if(queue.peek()>=stack.peek() && stack.peek() != taskKill){
                    stack.pop();
                    queue.poll();
                }
                else if(stack.peek() == taskKill) {
                    System.out.printf("Thread with value %d killed task %d\n",queue.peek(),stack.peek());
                    break;
                }else
                    queue.poll();
            }

        }
        System.out.println(queue.toString().replaceAll("[\\[\\],]",""));

    }
}
