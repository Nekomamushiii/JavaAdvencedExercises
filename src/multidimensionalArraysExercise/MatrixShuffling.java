package multidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] rowCol = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[rowCol[0]][];
        for(int i=0;i<matrix.length;i++){
            String[] arr = scanner.nextLine().split("\\s+");
            matrix[i]=arr;
        }
        String comm = scanner.nextLine();
        while(!comm.equals("END")){
            String[] input = comm.split("\\s+");
            if(input[0].equals("swap")){
                if(input.length == 5){
                    int oldRow = Integer.parseInt(input[1]);
                    int oldCol = Integer.parseInt(input[2]);
                    int newRow = Integer.parseInt(input[3]);
                    int newCol = Integer.parseInt(input[4]);
                    if(oldRow >= matrix.length || oldCol>=rowCol[1] || newRow>=matrix.length || newCol>=rowCol[1])
                        System.out.println("Invalid input!");
                    else{
                        swap(matrix,oldRow,oldCol,newRow,newCol);
                    }
                }else
                    System.out.println("Invalid input!");
            }else
                System.out.println("Invalid input!");
            comm=scanner.nextLine();
        }

    }
    private static void swap(String[][] matrix,int oldRow,int oldCol,int newRow,int newCol){
        String rem = matrix[oldRow][oldCol];
        matrix[oldRow][oldCol]=matrix[newRow][newCol];
        matrix[newRow][newCol]=rem;
        for (String[] strings : matrix) {
            for (String string : strings) System.out.print(string + " ");
            System.out.println();
        }
    }
}
