package multidimensionalArraysExercise;


import java.util.Arrays;
import java.util.Scanner;

public class MatrixPalindromes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] rowCol = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int row = rowCol[0];
        int col=rowCol[1];
        String[][] matrix = new String[row][col];
        generateMatrix(matrix,row,col);

    }
    private static void generateMatrix(String[][] matrix,int row,int col){

        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                matrix[j][i]=str(j,i);
            }
        }
        for (String[] strings : matrix) {
            for (String string : strings) System.out.print(string + " ");
            System.out.println();
        }

    }
    private static String str(int row, int coll){
       char ch =( char)(97+row);
       char middle =(char) (97+row+coll);
        return ch+""+middle+""+ch;
    }
}
