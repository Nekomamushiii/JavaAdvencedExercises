package setMapAdvenced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<Double,Integer> map = new LinkedHashMap<>();
        double[] num = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        for (double s : num) {
            if (map.containsKey(s))
                map.put(s, map.get(s) + 1);
            else
                map.put(s, 1);
        }
        map.forEach((k,v)-> System.out.printf("%.1f -> %d\n",k,v));
    }
}
