package multidimensionalArraysExercise;

import java.util.Scanner;

public class FillMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int row = Integer.parseInt(input[0]);
        int[][] matrixA = new int[row][row];
        int[][] matrixB = new int[row][row];
        switch(input[1]){
            case "A": fillA(matrixA);break;
            case "B": fillB(matrixB);break;
        }
    }
    private static void fillA(int[][] matrix){
        int num = 1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[j][i] = num;
                num++;
            }

        }
        for (int[] ints : matrix) {
            for (int anInt : ints) System.out.print(anInt + " ");
            System.out.println();
        }
    }
    private static void fillB(int[][] matrix){
        int num = 1;
        for(int i=0;i<matrix.length;i++){
            if(i%2==0){
                for(int j=0;j<matrix.length;j++){
                    matrix[j][i]=num;
                    num++;
                }
            }else{
                for(int j=matrix.length-1;j>=0;j--){
                    matrix[j][i]=num;
                    num++;
                }
            }
        }
        for (int[] ints : matrix) {
            for (int anInt : ints) System.out.print(anInt + " ");
            System.out.println();
        }
    }
}
