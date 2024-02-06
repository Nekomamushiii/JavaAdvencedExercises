package functionalProgrammingExercise;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class PartyFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BiPredicate<String,String[]> tester =(name,action) ->{
            if(action[1].equals("Starts with") || action[1].equals("Ends with") || action[1].equals("Contains")){
                return name.startsWith(action[2]) || name.endsWith(action[2]) || name.contains(action[2]);
            }else
                return name.length()==Integer.parseInt(action[2]);
        };

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String comm = scanner.nextLine();
        while(!comm.equals("Print")){
            String[] action = comm.split(";");
            if(action[0].equals("Add filter")){
                for(String s:names){
                    if(tester.test(s,action)){
                        names.set(names.indexOf(s), s.charAt(0)+"*"+s.substring(1));

                    }

                }
            }else{
                for (String s : names) {
                    if (tester.test(s, action)){
                        names.set(names.indexOf(s), s.replaceFirst("\\*",""));
                    }
                }
            }
        comm=scanner.nextLine();
        }
        names.forEach(e-> {
            if(!e.contains("*"))
               System.out.print(e+" ");
        });
    }

}
