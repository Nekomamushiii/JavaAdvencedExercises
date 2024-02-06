package multidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] rowCol = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int row1 = rowCol[0];
        int col1 = rowCol[1];
        int[][] matrix1 = new int[row1][col1];
        for(int i=0;i<row1;i++){
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix1[i]=arr;
        }
        rowCol=Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int row2=rowCol[0];
        int col2=rowCol[1];
        int[][] matrix2 = new int[row2][];
        for(int i=0;i<row2;i++){
            int[] arr= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix2[i]=arr;
        }
       System.out.println(isEqual(matrix1,matrix2) ? "equal" : "not equal");
    }
    public static boolean isEqual(int[][] m1,int[][] m2){
        if(m1.length != m2.length)
            return false;
        for(int i=0;i<m1.length;i++){
            if(m1[i].length != m2[i].length)
                return false;
            for(int j=0;j<m1[i].length;j++){
                if(m1[i][j] != m2[i][j])
                    return false;
            }
        }
        return true;
    }
}
