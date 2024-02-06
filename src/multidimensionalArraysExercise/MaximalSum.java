package multidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] rowCol = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[rowCol[0]][];
        for(int i=0;i<rowCol[0];i++){
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i]=arr;
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int row=-1;
        int col=-1;
        for(int i=0;i<matrix.length-2;i++){
            for(int j=0;j<matrix[i].length-2;j++){
                sum=sum(matrix,i,j);
                if(sum>max){
                    max=sum;
                    row=i;
                    col=j;
                }
            }
        }
        System.out.println("Sum = "+max);
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }
    private static int sum(int[][]matrix,int row,int coll){
        int sum=0;
        for(int i=row;i<row+3;i++){
            for(int j=coll;j<coll+3;j++)
                sum+=matrix[i][j];
        }
        return sum;
    }
}
