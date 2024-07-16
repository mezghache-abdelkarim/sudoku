public class SudokuPrinter {
    // Methode pour afficher une grille Sudoku
    public void printGrid(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(grid[i][j] + " "); 
            }
            System.out.println(); 
        }
    }
}
