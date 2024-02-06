package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        Deque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack,input);
        while(stack.size()>1){
            int firstNum = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());
            switch (op){
                case "+": stack.push(String.valueOf(firstNum+secondNum));break;
                case "-": stack.push(String.valueOf(firstNum-secondNum));break;
            }
        }
        System.out.println(stack.peek());
    }
}
