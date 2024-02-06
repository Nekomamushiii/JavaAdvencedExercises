package multidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfMatrixEl {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] rowCol = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int row=rowCol[0];
        int col=rowCol[1];
        int[][] matrix=new int[row][col];
        for(int i=0;i<row;i++){
            int[] arr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[i]=arr;
        }
        System.out.println(row);
        System.out.println(col);
        System.out.println(sum(matrix));
    }
    private static int sum(int[][] m){
        int sum=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++)
                sum+=m[i][j];
        }
        return sum;
    }
}
