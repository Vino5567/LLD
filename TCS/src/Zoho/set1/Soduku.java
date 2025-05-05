package Zoho.set1;

public class Soduku {
    public static void main(String[] args) {
        int[][] grid = {{5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}};

        System.out.println(check(grid, 0, 0));
    }

    public static boolean check(int[][] grid, int row, int col){
        if(row == 9){
            return true;
        }

        if(col == 9){
            return check(grid, row + 1, 0);
        }

        if(isValidGrid(grid, grid[row][col], row, col)){
            return check(grid, row, col + 1);
        }

        return false;
    }

    public static boolean isValidGrid(int[][] grid, int chk, int row, int col){

        for (int i = 0; i < 9; i++) {
            if(col == i) continue;
            if(grid[row][i] == chk){
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if(row == i) continue;
            if(grid[i][col] == chk){
                return false;
            }
        }

        int startRow = (row - (row % 3));
        int startCol = (col - (col % 3));

        for (int i = startRow; i <= startRow + 2; i++) {
            for (int j = startCol; j <= startCol + 2; j++) {
                if(row == i && col == j) continue;
                if(grid[i][j] == chk) return false;
            }
        }
        return true;
    }
}
