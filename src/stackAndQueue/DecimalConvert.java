package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DecimalConvert {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if(num==0)
            System.out.println("0");
        Deque<Integer> decimal = new ArrayDeque<>();
        while(num!=0){
            decimal.push(num%2);
            num/=2;
        }

        while(!decimal.isEmpty())
           System.out.print(decimal.pop());
    }
}
//10000000000
//10000000000