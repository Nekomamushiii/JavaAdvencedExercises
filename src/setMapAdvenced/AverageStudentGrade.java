package setMapAdvenced;

import java.util.*;

public class AverageStudentGrade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String, ArrayList<Double>> map = new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);
            if(map.containsKey(name))
                map.get(name).add(grade);
            else{
                map.put(name,new ArrayList<>());
                map.get(name).add(grade);
            }
        }
        //map.forEach((key, value) -> System.out.printf("%s -> %.2f (avg: %.2f)\n",key,value.stream().forEach(),value.stream().mapToDouble(Double::doubleValue).average().getAsDouble()));
        for(Map.Entry<String,ArrayList<Double>>entry:map.entrySet()){
            double sum =0.0;
            System.out.printf("%s -> ",entry.getKey());
            entry.getValue().forEach(e-> System.out.printf("%.2f ",e));
            for(Double l:entry.getValue())
                sum+=l;
            System.out.printf("(avg: %.2f)\n",sum/entry.getValue().size());
        }
    }
}
