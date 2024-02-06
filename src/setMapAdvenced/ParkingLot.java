package setMapAdvenced;

import java.sql.SQLOutput;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<String> parking = new LinkedHashSet<>();
        String comm = scanner.nextLine();
        while(!comm.equals("END")){
            String[] input = comm.split(", ");
            if(input[0].equals("IN"))
                parking.add(input[1]);
            else
                parking.remove(input[1]);
            comm=scanner.nextLine();
        }
        if(parking.isEmpty())
            System.out.println("Parking Lot is Empty");
        else
            for(String car:parking)
                System.out.println(car);
    }
}
