package genericsCountMethodString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        CountMethodString<String> countMethod = new CountMethodString<>();
        for(int i=0;i<n;i++){
            countMethod.add(scanner.nextLine());
        }
        String str = scanner.nextLine();
        System.out.println(countMethod.count(str));
    }
}
