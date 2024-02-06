//package ExamPrepation;
//
//import java.util.Scanner;
//
//public class ReVolt {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int rowCol = Integer.parseInt(scanner.nextLine());
//        int comNum = Integer.parseInt(scanner.nextLine());
//        boolean won = false;
//        String[][] matrix = new String[rowCol][];
//        for(int i=0;i<matrix.length;i++){
//            String[] arr = scanner.nextLine().split("");
//            matrix[i]=arr;
//        }
//
//        for(int i=0;i<2;i++){
//            String comm = scanner.nextLine();
//            switch (comm){
//                case "Up": up(matrix);
//            }
//            for(int k=0;k<matrix.length;k++){
//                for(int j=0;j<matrix[k].length;j++)
//                    System.out.print(matrix[k][j]);
//                System.out.println();
//            }
//        }
//
//    }
//    public static boolean up(String[][] matrix) {
//        boolean won = false;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j].equals("f")) {
//                    matrix[i][j] = "-";
//                    if (i - 1 < 0) {
//                        if (matrix[matrix.length - 1][j].equals("F")) {
//                            matrix[matrix.length - 1][j] = "f";
//                            return true;
//                        }
//
//                    } else {
//                        matrix[i - 1][j] = "f";
//                    }
//                    return won;
//                }
//            }
//        }
//        for (int k = 0; k < matrix.length; k++) {
//            for (int j = 0; j < matrix[k].length; j++)
//                System.out.print(matrix[k][j]);
//            System.out.println();
//        }
//    }
//}
