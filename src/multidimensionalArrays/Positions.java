package multidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Positions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] rowCol = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int row=rowCol[0];
        int col=rowCol[1];
        int[][] matrix = new int[row][col];
        for(int i=0;i<row;i++){
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i]=arr;
        }
        int search = Integer.parseInt(scanner.nextLine());
        boolean isFound=false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==search){
                   System.out.println(i+" "+j);
                   isFound=true;
                }
            }
        }
        if(!isFound)
            System.out.println("not found");
    }
}
