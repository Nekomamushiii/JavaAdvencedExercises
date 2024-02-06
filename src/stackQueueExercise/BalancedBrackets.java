package stackQueueExercise;

import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Character> stack = new ArrayDeque<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        boolean bish =false;
        String brackets = scanner.nextLine();
        for(int i=0;i<brackets.length();i++){
            if(map.containsKey(brackets.charAt(i))){
               if(!stack.isEmpty() && stack.peek() == map.get(brackets.charAt(i)))
                   stack.pop();
               else {
                   bish = true;
                   break;
               }
            }else
                stack.push(brackets.charAt(i));

        }
        if(bish)
            System.out.println("NO");
        else
           System.out.println(stack.isEmpty() ? "YES": "NO");
    }
}
