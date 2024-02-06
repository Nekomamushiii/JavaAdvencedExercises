package multidimensionalArrays;

import java.util.Scanner;

public class FindRealQueen {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[][] chess = new char[8][8];
        for(int i=0;i<chess.length;i++){
            String[] arr = scanner.nextLine().split("\\s+");
            for(int j=0;j<chess[i].length;j++)
               chess[i][j] = arr[j].charAt(0);
        }
        boolean queen = false;
        int[] realQueen=new int[2];
        int row=-1;
        int coll=-1;
        for (int i=0;i<8;i++) {
            for (int j=0;j<8;j++){
                if(chess[i][j] == 'q'){
                    row=i;
                    coll=j;
                    queen=checkReal(row,coll,chess);
                }
                if(queen){
                    realQueen[0]=row;
                    realQueen[1]=coll;
                }
            }

        }
        System.out.println(realQueen[0]+" "+realQueen[1]);
    }
    private static boolean checkReal(int row,int coll,char[][] chess){
        boolean queen = true;
        for(int j=coll+1;j<8;j++){
            if(chess[row][j] == 'q')
                return false;
        }
        for(int i =0;i<8;i++){
            if(i != row){
                if(chess[i][coll]=='q')
                    return false;
            }
        }
        int j = coll;
        for(int i=row-1;i>=0;i--){
           j-=1;
           if(j>=0){
               if(chess[i][j] == 'q')
                   return false;
           }

        }
        int k=coll;
        for(int i =row+1;i<8;i++){
            k++;
            if(k<8){
                if(chess[i][k] == 'q')
                    return false;
            }
        }
        int a =coll;
        for(int i = row+1;i<8;i++){
            a--;
            if(a>=0){
                if(chess[i][a] == 'q')
                    return false;
            }
        }
        int b=coll;
        for(int i=row-1;i>=0;i--){
            b++;
            if(b<8){
                if(chess[i][b] == 'q')
                    return false;
            }
        }
        return true;
    }
}
