package listlyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ListyIterator<String> listyIterator =null;
        String comm = scanner.nextLine();
        while(!comm.equals("END")){
            String[] action = comm.split("\\s+");
            switch (action[0]){
                case "Create": {
                    if(action.length>1)
                        listyIterator = new ListyIterator<>(Arrays.copyOfRange(action,1,action.length));
                    else
                        listyIterator = new ListyIterator<String>();
                }break;
                case "Move": System.out.println(listyIterator.move());break;
                case "HasNext": System.out.println(listyIterator.hasNext());break;
                case "Print": try {
                    listyIterator.print();
                }catch (IllegalStateException e){
                    System.out.println(e.getMessage());
                }break;
            }
            comm=scanner.nextLine();
        }
    }
}
