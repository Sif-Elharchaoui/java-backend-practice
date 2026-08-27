package fundamentals.arrays;

public class GridPrinter {
    public static void main(String[] args) {
        int[][] grid = {
                {10, 20, 30},
                {40, 50, 60}
        };

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.println("Row " + i + ", Col " + j + ": " + grid[i][j]);
            }
        }
    }
}