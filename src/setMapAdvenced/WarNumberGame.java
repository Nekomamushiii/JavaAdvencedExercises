package setMapAdvenced;

import java.util.*;
import java.util.stream.Collectors;

public class WarNumberGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkedHashSet<Integer> player1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
        LinkedHashSet<Integer> player2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        for(int i=1;i<=50;i++){
            int player1Num = player1.iterator().next();
            int player2Num = player2.iterator().next();
            player1.remove(player1Num);
            player2.remove(player2Num);

            if(player1Num>player2Num){
                player1.add(player1Num);
                player1.add(player2Num);

            }
            else if(player1Num<player2Num){
                player2.add(player1Num);
                player2.add(player2Num);
            }

            if(player1.isEmpty() || player2.isEmpty())
                break;
        }

        if(player1.size()==player2.size())
            System.out.println("Draw!");
        else{
            if(player1.size()>player2.size())
                System.out.println("First player win!");
            else
                System.out.println("Second player win!");
        }
    }
}
