package multidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCol=Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rowCol][];
        int diagonal1=0;
        int diagonal2=0;
        int coll=0;
        for(int i=0;i<rowCol;i++){
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i]=arr;
            if(i==coll)
                diagonal1+=matrix[i][coll];
            diagonal2+=matrix[i][arr.length-1-coll];
            coll++;
        }
        System.out.println(Math.abs(diagonal1-diagonal2));
    }
}
