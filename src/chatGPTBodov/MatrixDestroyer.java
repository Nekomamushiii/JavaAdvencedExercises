package chatGPTBodov;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixDestroyer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowCol = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = rowCol[0];
        int cols = rowCol[1];
        int[][] matrix = new int[rows][cols];

        // Fill the matrix with increasing integers
        int count = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = count++;
            }
        }

        // Process commands until "Nuke it from orbit" is entered
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("Nuke it from orbit")) {
                break;
            }

            String[] commandArgs = command.split(" ");
            int row = Integer.parseInt(commandArgs[0]);
            int col = Integer.parseInt(commandArgs[1]);
            int radius = Integer.parseInt(commandArgs[2]);

            // Destroy cells in the cross pattern
            for (int i = row - radius; i <= row + radius; i++) {
                if (i >= 0 && i < rows && col >= 0 && col < cols) {
                    matrix[i][col] = 0; // Destroy cell in the column
                }
            }
            for (int j = col - radius; j <= col + radius; j++) {
                if (row >= 0 && row < rows && j >= 0 && j < cols) {
                    matrix[row][j] = 0; // Destroy cell in the row
                }
            }
        }

        // Print the remaining matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                 System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
}

