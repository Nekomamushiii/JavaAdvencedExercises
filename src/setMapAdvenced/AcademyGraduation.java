package setMapAdvenced;

import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,Double> map = new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            String name = scanner.nextLine();
            double[] score = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
//            String[] scoreStr = scanner.nextLine().split("\\s+");
//            Double[] score = new Double[scoreStr.length];
            double sum = 0.0;
//            for(int j=0;j<scoreStr.length;j++){
//                score[j]=Double.parseDouble(scoreStr[j]);
//                sum+=score[j];
//            }
            for (double v : score) sum += v;
            double avg = sum/score.length;

            map.put(name,avg);
        }
        map.forEach((k,v)->System.out.println(k+" is graduated with "+ v));
    }
}
