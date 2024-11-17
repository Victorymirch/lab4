package Lab4;

public class n7 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int[][] snakeArray = new int[rows][cols];

        int num = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {

                for (int j = 0; j < cols; j++) {
                    snakeArray[i][j] = num++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    snakeArray[i][j] = num++;
                }
            }
        }

        System.out.println("массив змейкой");
        printArray(snakeArray);
    }

    // Method to print the array
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); // Move to the next line after printing one row
        }
    }
}