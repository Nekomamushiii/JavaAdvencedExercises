package stackQueueExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class BasicStackOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] comm = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] num = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<comm[0];i++){
            stack.push(num[i]);
        }
        for(int i=0;i<comm[1];i++)
            stack.pop();
        Deque<Integer> newStack = new ArrayDeque<>();
        boolean bna = false;
        int min = Integer.MAX_VALUE;
        while(!stack.isEmpty()) {
            if (stack.peek() == comm[2])
                bna = true;
            newStack.push(stack.pop());
        }
        if(!bna){
            if(newStack.isEmpty())
                System.out.println("0");
            else{
                while(!newStack.isEmpty()){
                    if(newStack.peek()<min)
                        min=newStack.peek();
                    newStack.pop();
                }
                System.out.println(min);
            }
        }else
            System.out.println("true");
    }
}
