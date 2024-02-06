package stackQueueExercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int commNum = Integer.parseInt(scanner.nextLine());
        Deque<String> stack = new ArrayDeque<>();
        String text = "";
        stack.push(text);
        for(int i=0;i<commNum;i++){
           String[] comm = scanner.nextLine().split("\\s+");
           switch (comm[0]){
               case "1": {
                   text+=comm[1];
                   stack.push(text);
                   break;
               }
               case "2": {
                   int count = Integer.parseInt(comm[1]);
                   if(count>text.length())
                       count=text.length();
                   for(int j=count-1;j>=0;j--)
                       text=text.replaceFirst(String.valueOf(text.charAt(text.length()-1-j)),"");
                   stack.push(text);
               }break;
               case "3": {
                   int index = Integer.parseInt(comm[1]);
                   if(index>text.length())
                       System.out.println("");
                   else
                       System.out.println(text.charAt(index-1));
               }break;
               case "4": {
                   stack.pop();
                   text=stack.peek();break;
               }
           }
        }
    }
}
