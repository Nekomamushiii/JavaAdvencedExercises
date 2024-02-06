package genericsSwapMethodStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        SwapMethodStrings<String> swap = new SwapMethodStrings<>();
        for(int i=0;i<n;i++){
            swap.add(scanner.nextLine());
        }
        String[] index = scanner.nextLine().split("\\s+");
        int index1=Integer.parseInt(index[0]);
        int index2 = Integer.parseInt(index[1]);
        swap.swap(index1,index2);
        swap.printToString();
    }
}
