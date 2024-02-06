package stackQueueExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        int commNum = Integer.parseInt(scanner.nextLine());
        Deque<Integer> max = new ArrayDeque<>();
        for(int i=0;i<commNum;i++){
            int[] comm = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            switch (comm[0]){
                case 1: stack.push(comm[1]);
                if(stack.size()==1)
                    max.push(comm[1]);
                else{
                    if(comm[1]>max.peek()){
                        max.push(comm[1]);
                    }else
                        max.push(max.peek());
                }
                break;
                case 2: stack.pop();max.pop(); break;
                case 3:
                    System.out.println(max.peek());break;
                }
        }
    }
}
//1 97
//2
//1 20
//2
//1 26
//1 20
//2
//3
//1 91
//1 66
//1 23
//2
//2
//2
//1 33
//3