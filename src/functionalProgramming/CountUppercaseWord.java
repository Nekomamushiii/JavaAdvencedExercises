package functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("\\s+" );
        Predicate<String> isUppercase = s->Character.isUpperCase(s.charAt(0));
        List<String> word = new ArrayList<>();
        for (String s : text)
            if (isUppercase.test(s))
                word.add(s);
        System.out.println(word.size());
        for(String w:word)
            System.out.println(w);
    }
}
