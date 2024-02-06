package genericsSwapMethodInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        SwapMethodIntegers<Integer> swap = new SwapMethodIntegers<>();
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            swap.add(Integer.parseInt(scanner.nextLine()));
        }
        String[] index = scanner.nextLine().split("\\s+");
        swap.swap(Integer.parseInt(index[0]),Integer.parseInt(index[1]));
        swap.toPrint();
    }
}
