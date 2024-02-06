package multidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++){
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i]=arr;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++)
                if(i==j)
                    System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
        int j=0;
        for(int i=matrix.length-1;i>=0;i--){
          System.out.print(matrix[i][j]+" ");
          j++;
        }
    }
}
