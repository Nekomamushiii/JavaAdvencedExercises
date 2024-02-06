package genericsCountMethodDouble;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CountMethodDouble<Double> countMethod = new CountMethodDouble<>();
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            countMethod.add(Double.parseDouble(scanner.nextLine()));
        }
        double num = Double.parseDouble(scanner.nextLine());
        System.out.println(countMethod.count(num));
    }
}
