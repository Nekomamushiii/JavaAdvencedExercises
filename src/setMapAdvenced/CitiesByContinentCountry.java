package setMapAdvenced;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CitiesByContinentCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, ArrayList<String>>> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String continent = data[0];
            String country = data[1];
            String city = data[2];
            if (!map.containsKey(continent)) {
                map.put(continent, new LinkedHashMap<>());
            }
            if(map.get(continent).containsKey(country))
                map.get(continent).get(country).add(city);
            else{
                map.get(continent).put(country,new ArrayList<>());
                map.get(continent).get(country).add(city);
            }
        }
        for(Map.Entry<String,Map<String,ArrayList<String>>>entry:map.entrySet()){
            System.out.printf("%s:\n",entry.getKey());
            entry.getValue().forEach((k,v)->System.out.printf("  %s -> %s\n",k,String.join(", ",v)));
        }
    }
}