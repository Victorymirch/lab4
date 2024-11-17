package Lab4;

import java.util.Random;

public class n6 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int[][] originalArray = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                originalArray[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Original Array:");
        printArray(originalArray);

        int rowToRemove = random.nextInt(rows);
        int colToRemove = random.nextInt(cols);

        System.out.println("Removing row: " + rowToRemove + ", column: " + colToRemove);

        int[][] newArray = new int[rows - 1][cols - 1];

        for (int i = 0, newRow = 0; i < rows; i++) {
            if (i == rowToRemove) continue;

            for (int j = 0, newCol = 0; j < cols; j++) {
                if (j == colToRemove) continue;
                newArray[newRow][newCol] = originalArray[i][j];
                newCol++;
            }
            newRow++;
        }

        System.out.println("new massive");
        printArray(newArray);
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}