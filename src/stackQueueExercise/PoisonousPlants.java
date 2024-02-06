package stackQueueExercise;

import java.util.*;

public class PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> amid=new ArrayDeque<>();
        Deque<Integer> uhsen=new ArrayDeque<>();
        int n=Integer.parseInt(scanner.nextLine());
        int[] plants = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        for (int plant : plants) {
            stack.push(plant);
        }
        System.out.println(Arrays.toString(stack.toArray()));
        boolean nemedsen = false;
        int day=0;
        while(true){
            nemedsen=false;
            while(!stack.isEmpty()){
                int num = stack.pop();

                if(!stack.isEmpty()){
                    if(stack.peek()>num){
                        amid.push(num);
                    }
                    else {
                        uhsen.push(num);
                        nemedsen=true;
                    }
                }
            }
            day++;
            if(!nemedsen)
               break;
            while(!amid.isEmpty())
                stack.push(amid.pop());
        }

     System.out.println(day);

    }
}
