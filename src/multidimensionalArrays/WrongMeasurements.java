package multidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[row][];
        int coll=0;
        for(int i=0;i<row;i++){
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i]=arr;
            coll=matrix[i].length;
        }
        int[] rowColl=Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int measureRow=rowColl[0];
        int measureCol=rowColl[1];
        int up;
        int down;
        int left;
        int right;
        int measure=matrix[measureRow][measureCol];
        int[][] newMatrix = new int[row][coll];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                int saved = matrix[i][j];
                if(matrix[i][j] == measure){
                    up=i-1 < 0 || matrix[i-1][j] ==measure ? 0 : matrix[i-1][j];
                    down=i+1== matrix.length || matrix[i+1][j] ==measure ? 0 : matrix[i+1][j];
                    left=j-1<0 || matrix[i][j-1]==measure ? 0 : matrix[i][j-1];
                    right=j+1== matrix[i].length || matrix[i][j+1] == measure ? 0 : matrix[i][j+1];
                    saved = up+down+left+right;
                }
                newMatrix[i][j]=saved;
            }
        }
        for (int[] ints : newMatrix) {
            for (int anInt : ints) System.out.print(anInt + " ");
            System.out.println();
        }
    }
}
