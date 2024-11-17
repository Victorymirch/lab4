package Lab4;

public class n3 {
    public static void main(String[] args) {
        int rows = 11;
        int cols = 23;
        int[][] rectangle = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rectangle[i][j] = 2;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}