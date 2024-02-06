package multidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum2X2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] rowCol= Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int row=rowCol[0];
        int col=rowCol[1];
        int[][] matrix = new int[row][col];
        for(int i=0;i<row;i++){
            int[] arr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[i]=arr;
        }
        int max = Integer.MIN_VALUE;
        int[] resultRow = new int[2];
        int[] resultCol = new int[2];
        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[i].length-1;j++){
                int sum = matrix[i][j]+matrix[i][j+1]+matrix[i+1][j]+matrix[i+1][j+1];
                if(sum>max){
                    max=sum;
                    resultRow[0] = matrix[i][j];
                    resultRow[1] = matrix[i][j+1];
                    resultCol[0] =matrix[i+1][j];
                    resultCol[1] =matrix[i+1][j+1];
                }
            }
        }
        System.out.println(resultRow[0]+" "+resultRow[1]);
        System.out.println(resultCol[0]+" "+resultCol[1]);
        System.out.println(max);
    }

}
