public class SudokuTransposer {
    // methode pour transposer une grille Sudoku
    public int[][] transpose(int[][] grid) {
        int[][] transposed = new int[9][9]; // Initialise une nouvelle grille transposee
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                transposed[j][i] = grid[i][j]; // Échange les lignes et colonnes
            }
        }
        
        return transposed; // Retourne la grille transposee
    }
}
