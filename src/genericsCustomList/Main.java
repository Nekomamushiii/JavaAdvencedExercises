package genericsCustomList;

import genericsCustomListSorter.Sorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CustomList<String> myList = new CustomList<>();
        String comm = scanner.nextLine();
        while(!comm.equals("END")){
           String[] action = comm.split("\\s+");
           switch (action[0]){
               case "Add": myList.add(action[1]);break;
               case "Remove": myList.remove(Integer.parseInt(action[1]));break;
               case "Contains": System.out.println(myList.contains(action[1]));break;
               case "Swap": myList.swap(Integer.parseInt(action[1]),Integer.parseInt(action[2]));break;
               case "Greater": System.out.println(myList.count(action[1]));break;
               case "Max": System.out.println(myList.getMax());break;
               case "Min": System.out.println(myList.getMin());break;
               case "Print":myList.print();break;
               case "Sort":
                  Sorter.sort(myList);
           }
           comm=scanner.nextLine();
        }
    }
}
