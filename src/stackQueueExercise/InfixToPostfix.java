package stackQueueExercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Deque<Character> stack = new ArrayDeque<>();
        Deque<Character> queue = new ArrayDeque<>();
        String input=scanner.nextLine();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i) == '+' || input.charAt(i)=='-')
                stack.push(input.charAt(i));


        }
    }
}
