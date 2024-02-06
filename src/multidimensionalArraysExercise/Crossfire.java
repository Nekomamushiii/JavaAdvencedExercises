package multidimensionalArraysExercise;

import java.util.*;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] rowCol = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = rowCol[0];
        int cols=rowCol[1];
        int[][] matrix = new int[rows][cols];
        int num=1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=num;
                num++;
            }
        }
        String comm = scanner.nextLine();
        while(!comm.equals("Nuke it from orbit")){
            String[] arr = comm.split(" ");
            int row = Integer.parseInt(arr[0]);
            int col = Integer.parseInt(arr[1]);
            int radius = Integer.parseInt(arr[2]);

            for (int i = row - radius; i <= row + radius; i++) {
                if (i >= 0 && i < rows && col >= 0 && col < cols) {
                    matrix[i][col] = 0;
                }
            }
            for (int j = col - radius; j <= col + radius; j++) {
                if (row >= 0 && row < rows && j >= 0 && j < cols) {
                    matrix[row][j] = 0;
                }
            }

            matrix=deleteCell(matrix,rows,cols);

            comm=scanner.nextLine();
        }
        for (int[] ints : matrix) {
            for (int anInt : ints)
                if (anInt != 0)
                    System.out.print(anInt + " ");
            System.out.println();
        }

    }

    private static int[][] deleteCell(int[][] matrix,int row, int col){
        int[][] matrixB = new int[row][col];
        int rowB=0;

        for (int[] ints : matrix) {
            int colB = 0;
            boolean isRow = false;
            for (int anInt : ints) {
                if (anInt != 0) {
                    matrixB[rowB][colB] = anInt;
                    colB++;
                    isRow=true;
                }
            }
            if(isRow)
                rowB++;
        }
        return matrixB;
    }
}
