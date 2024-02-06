package functionalProgrammingExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Predicate<String> tester = e->e.length()<=n;
        List<String> names = new ArrayList<>();
        for(String name:scanner.nextLine().split("\\s+" ))
            if(tester.test(name))
                names.add(name);
        names.forEach(System.out::println);
    }
}
