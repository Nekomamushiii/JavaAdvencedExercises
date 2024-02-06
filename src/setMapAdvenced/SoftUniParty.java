package setMapAdvenced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();
        String comm = scanner.nextLine();
        while(!comm.equals("PARTY")){
            if(Character.isDigit(comm.charAt(0)))
                vip.add(comm);
            else
                regular.add(comm);
            comm=scanner.nextLine();
        }
        comm=scanner.nextLine();
        while(!comm.equals("END")){
            if(Character.isDigit(comm.charAt(0)))
                vip.remove(comm);
            else
                regular.remove(comm);
            comm=scanner.nextLine();
        }
        System.out.println(vip.size()+regular.size());
        for(String v:vip)
            System.out.println(v);
        for(String r:regular)
            System.out.println(r);

    }
}
