package multidimensionalArraysExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String rotationCom = scanner.nextLine();
        String input = scanner.nextLine();
        List<String> list = new ArrayList<>();
        while(!input.equals("END")){
            list.add(input);
            input=scanner.nextLine();
        }
        int row= list.size();

        int col=Integer.MIN_VALUE;
        for(String l:list){
            if(l.length()>col)
               col=l.length();
        }
        char[][] matrix = new char[row][col];

        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++)
                if(list.get(i).length()-1<j)
                    matrix[i][j]=' ';
                else
                    matrix[i][j]=list.get(i).charAt(j);
        }
        rotationCom=rotationCom.replaceAll("\\D","");
        int rotation = Integer.parseInt(rotationCom);
        if(rotation/90%4==1)
            rotation1(matrix,row,col);
        else if(rotation/90%4==2)
            rotation2(matrix,row,col);
        else if(rotation/90%4==3)
            rotation3(matrix,row,col);
        else{
            for (char[] chars : matrix) {
                for (char aChar : chars) System.out.print(aChar);
                System.out.println();
            }
        }

    }
    private static void rotation1(char[][] matrix,int row,int col){
        for(int i=0;i<col;i++){
            for(int j=row-1;j>=0;j--)
                System.out.print(matrix[j][i]);
            System.out.println();
        }
    }
    private static void rotation2(char[][] matrix,int row,int col){
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--)
                System.out.print(matrix[i][j]);
            System.out.println();
        }
    }
    private static void rotation3(char[][] matrix,int row,int col){
        for(int i=col-1;i>=0;i--){
            for(int j=0;j<row;j++)
                System.out.print(matrix[j][i]);
            System.out.println();
        }
    }
}
