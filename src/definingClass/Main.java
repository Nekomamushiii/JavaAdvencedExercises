package definingClass;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//
//        for(int i=0;i<n;i++){
//            String[] arr = scanner.nextLine().split("\\s+");
//            Car car = new Car(arr[0]);
//            if(arr.length==3)
//                car = new Car(arr[0],arr[1],Integer.parseInt(arr[2]));
//
//            System.out.println(car.carInfo());
//        }
        Map<Integer,BankAccount> map = new LinkedHashMap<>();

        String comm = scanner.nextLine();
        while(!comm.equals("End")){
            String[] input = comm.split("\\s+");
            switch (input[0]){
                case "Create": {
                    BankAccount bankAccount = new BankAccount();
                    map.put(bankAccount.getId(), bankAccount);
                    System.out.printf("Account ID%d created\n",bankAccount.getId());
                }break;
                case "Deposit":{
                    int id = Integer.parseInt(input[1]);
                    double amount = Double.parseDouble(input[2]);
                    if(map.containsKey(id)){
                        map.get(id).deposit(amount);
                        System.out.printf("Deposited %.0f to ID%d\n",amount,id);
                    }
                    else
                        System.out.println("Account does not exist");
                }break;
                case "SetInterest": {
                    double interest = Double.parseDouble(input[1]);
                    BankAccount.setInterest(interest);
                }break;
                case "GetInterest": {
                    int id = Integer.parseInt(input[1]);
                    int year = Integer.parseInt(input[2]);
                    if(map.containsKey(id)){
                        System.out.printf("%.2f\n",map.get(id).getInterest(year));
                    }else
                        System.out.println("Account does not exist");
                }
            }
            comm= scanner.nextLine();
        }
    }
}
