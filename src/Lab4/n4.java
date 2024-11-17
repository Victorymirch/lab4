package Lab4;

public class n4 {
    public static void main(String[] args) {
        int height = 11;
        int[][] triangle = new int[height][height];


        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = 1;
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (triangle[i][j] == 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}