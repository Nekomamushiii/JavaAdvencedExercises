package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        String input = scanner.nextLine();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i) == '(')
                stack.push(i);
            else if(input.charAt(i)==')')
                System.out.println(input.substring(stack.pop(),i+1));
        }
    }
}
