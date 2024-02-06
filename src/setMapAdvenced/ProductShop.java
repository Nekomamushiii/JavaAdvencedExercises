package setMapAdvenced;

import java.util.*;


public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String, Map<String,Double>> map = new TreeMap<>();
        String command = scanner.nextLine();
        while(!command.equals("Revision")){
            String[] data = command.split(", ");
            String shop = data[0];
            String product = data[1];
            double price = Double.parseDouble(data[2]);
            if(map.containsKey(shop))
                map.get(shop).put(product,price);
            else{
                map.put(shop,new LinkedHashMap<>());
                map.get(shop).put(product,price);
            }
            command=scanner.nextLine();
        }
        for(Map.Entry<String, Map<String,Double>>entry:map.entrySet()){
            System.out.printf("%s->\n",entry.getKey());
            entry.getValue().forEach((k,v)->System.out.printf("Product: %s, Price: %.1f\n",k,v));
        }
    }
}
