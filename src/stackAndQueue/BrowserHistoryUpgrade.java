package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Deque<String> history = new ArrayDeque<>();
        Deque<String> forward = new ArrayDeque<>();
        String input=scanner.nextLine();
        while(!input.equals("Home")){
            if(input.equals("back")){
                if(history.size()>1){
                    forward.push(history.pop());
                    System.out.println(history.peek());}
                else
                    System.out.println("no previous URLs");
            }else if(input.equals("forward")){
               if(forward.isEmpty())
                   System.out.println("no next URLs");
               else{
                   System.out.println(forward.pop());

               }
            }else{
                history.push(input);
                System.out.println(history.peek());
                forward=new ArrayDeque<>();
            }
            input=scanner.nextLine();
        }

    }
}

