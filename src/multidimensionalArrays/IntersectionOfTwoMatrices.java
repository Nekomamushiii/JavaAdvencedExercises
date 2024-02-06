package multidimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row=Integer.parseInt(scanner.nextLine());
        int col=Integer.parseInt(scanner.nextLine());
        char[][] matrix1 = new char[row][col];
        char[][] matrix2 = new char[row][col];
        for(int i=0;i<row;i++){
            String[] arr = scanner.nextLine().split("\\s+");
            for(int j=0;j<matrix1[i].length;j++)
                matrix1[i][j] = arr[j].charAt(0);
        }
        for(int i=0;i<row;i++){
            String[] arr = scanner.nextLine().split("\\s+");
            for(int j=0;j<matrix2[i].length;j++)
                matrix2[i][j]=arr[j].charAt(0);
        }
        for(int i =0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                if(matrix1[i][j] != matrix2[i][j])
                    matrix1[i][j]='*';
            }
        }
        for (char[] chars : matrix1) {
            for (int j = 0; j < chars.length; j++)
                System.out.print(chars[j] + " ");
            System.out.println();
        }
    }
}
