package multidimensionalArraysExercise;

import java.util.Scanner;

public class TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix=new int[15][15];
        int num=0;
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[i].length;j++)
                matrix[i][j]=num++;
        for (int[] ints : matrix) {
            for (int anInt : ints){
                if(anInt<10)
                   System.out.printf("%d   ",anInt);
                else if(anInt<100)
                    System.out.printf("%d  ",anInt);
                else System.out.printf("%d ",anInt);
            }
            System.out.println();
        }
    }
}
