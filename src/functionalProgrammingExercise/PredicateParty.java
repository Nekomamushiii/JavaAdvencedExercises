package functionalProgrammingExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        BiPredicate<String,String[]> tester = (name,action)->{
           if(action[1].equals("StartsWith") || action[1].equals("EndsWith"))
               return name.startsWith(action[2]) || name.endsWith(action[2]);
           else
               return name.length() == Integer.parseInt(action[2]);
        };

        String comm = scanner.nextLine();

        while(!comm.equals("Party!")){
            String[] action = comm.split("\\s+");
            if(action[0].equals("Remove"))
               names.removeIf(name -> tester.test(name,action));
            else {
                 for(int i=0;i< names.size();i++){
                     if(tester.test(names.get(i),action)){
                         names.add(i+1,names.get(i));
                         i++;
                     }
                 }
            }
            comm=scanner.nextLine();
        }

        if(names.isEmpty())
            System.out.println("Nobody is going to the party!");
        else{
            Collections.sort(names);
            System.out.print(String.join(", ",names));;
            System.out.print(" are going to the party!");
        }
    }
}
