package workshop;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartArray smartArray=new SmartArray();
        CustomStack customStack=new CustomStack();
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        for (int j : arr) smartArray.add(j);
        for(int i : arr) customStack.add(i);


        smartArray.forEach(e->System.out.print(e+" "));
        System.out.println();
        System.out.println(smartArray.remove(3));
        smartArray.forEach(e->System.out.print(e+" "));
        System.out.println("Stack");
        smartArray.add(3,76);
        smartArray.forEach(e->System.out.print(e+" "));

        System.out.println(customStack.peek());
        customStack.forEach(e-> System.out.print(e+" "));
        System.out.println();
        System.out.println(customStack.pop());
        customStack.forEach(e-> System.out.print(e+" "));
    }
}
