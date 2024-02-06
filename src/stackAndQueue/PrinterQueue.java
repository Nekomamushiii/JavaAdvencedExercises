package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Deque<String> queue = new ArrayDeque<>();
        String input = scanner.nextLine();
        while(!input.equals("print")){
            if(input.equals("cancel")){
                if(queue.isEmpty())
                    System.out.println("Printer is on standby");
                else{
                   System.out.printf("Canceled %s\n",queue.poll());
                }
            }else{
                queue.add(input);
            }
            input=scanner.nextLine();
        }
        while(!queue.isEmpty())
            System.out.println(queue.poll());
    }
}
