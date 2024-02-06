package functionalProgramming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterAge {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Function<String,Integer> parser = Integer::parseInt;
        Map<String,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            String[] data = scanner.nextLine().split(", ");
            map.put(data[0],parser.apply(data[1]));
        }
        String condition = scanner.nextLine();
        int age = parser.apply(scanner.nextLine());
        String format = scanner.nextLine();
        Predicate<Integer> tester = createTester(condition,age);
        Consumer<Map.Entry<String,Integer>> print = printFormat(format);
        printFilteredFormat(map,tester,print);
    }
    static Predicate<Integer> createTester(String condition,int age){
        Predicate<Integer> tester = null;
        switch (condition){
            case "younger": tester = e->e<=age;break;
            case "older": tester = e->e>=age;break;
        }
        return tester;
    }
    static Consumer<Map.Entry<String,Integer>> printFormat(String format){
        Consumer<Map.Entry<String,Integer>> print = null;
        switch (format){
            case "name age": print = e-> System.out.printf("%s - %d\n",e.getKey(),e.getValue());break;
            case "name": print=e-> System.out.println(e.getKey());break;
            case "age": print=e-> System.out.println(e.getValue());break;
        }
        return print;
    }
    private static void printFilteredFormat(Map<String,Integer> map,Predicate<Integer> tester,Consumer<Map.Entry<String,Integer>> print){
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(tester.test(entry.getValue()))
                print.accept(entry);
        }
    }
}
