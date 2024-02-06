package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        UnaryOperator<Double> vatPrice = p->p*1.2;
        List<Double> vatPriceList = Arrays.stream(scanner.nextLine().split(", ")).map(Double::parseDouble).collect(Collectors.toList());
        for(Double price:vatPriceList){
            vatPriceList.set(vatPriceList.indexOf(price),vatPrice.apply(price));
        }
        System.out.println("Prices with VAT:");
        vatPriceList.forEach(e->System.out.printf("%.2f\n",e));
    }
}
