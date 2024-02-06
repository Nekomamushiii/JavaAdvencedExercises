package ex;

import java.util.*;
import java.util.stream.Stream;

public class ZombieApocalypse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] textilesInput = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] medicamentsInput = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> textilesQueue = new ArrayDeque<>();
        for(int i:textilesInput) textilesQueue.add(i);
        Deque<Integer> medicamentsStack = new ArrayDeque<>();
        for(int i:medicamentsInput) medicamentsStack.push(i);


        Map<String, Integer> map = new HashMap<>();


        while (!textilesQueue.isEmpty() && !medicamentsStack.isEmpty()) {
            int sum = textilesQueue.peek() + medicamentsStack.peek();

            if(sum==100){
                if(map.containsKey("Medkit"))
                    map.put("Medkit",map.get("Medkit")+1);
                else
                    map.put("Medkit",1);
                textilesQueue.poll();
                medicamentsStack.pop();
            }
            else if(sum == 40){
                if(map.containsKey("Bandage"))
                   map.put("Bandage",map.get("Bandage")+1);
                else
                    map.put("Bandage",1);
                textilesQueue.poll();
                medicamentsStack.pop();
            }
            else if(sum==30){
                if(map.containsKey("Patch"))
                   map.put("Patch",map.get("Patch")+1);
                else
                    map.put("Patch",1);
                textilesQueue.poll();
                medicamentsStack.pop();
            }
            else if(sum>100) {
                if(map.containsKey("Medkit"))
                   map.put("Medkit", map.get("Medkit") + 1);
                else
                    map.put("Medkit",1);
                sum -= 100;
                textilesQueue.poll();
                medicamentsStack.pop();
                int num = medicamentsStack.pop() + sum;
                medicamentsStack.push(num);
            }else{
                textilesQueue.poll();
                int num = medicamentsStack.pop() + 10;

                medicamentsStack.push(num);
                }

        }

        if (textilesQueue.isEmpty() && medicamentsStack.isEmpty()) {
            System.out.println("Textiles and medicaments are both empty.");
        } else if (textilesQueue.isEmpty()) {
            System.out.println("Textiles are empty.");
        } else {
            System.out.println("Medicaments are empty.");
        }

        map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(e-> System.out.printf("%s - %d\n",e.getKey(),e.getValue()));


       if(!medicamentsStack.isEmpty()){
           System.out.print("Medicaments left: ");
           System.out.println(medicamentsStack.toString().replaceAll("[\\[\\]]",""));
        }
       if(!textilesQueue.isEmpty()){
           System.out.print("Textiles left: ");
           System.out.println(textilesQueue.toString().replaceAll("[\\[\\]]",""));
       }

    }
}

