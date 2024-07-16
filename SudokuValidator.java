public class SudokuValidator {
    // valider la grille Sudoku
    public boolean isValidSudoku(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(grid, i) || !isValidColumn(grid, i)) {
                return false; // Si une ligne ou colonne n'est pas valide, retourne false
            }
        }
        return true; 
    }

    // valider une ligne de la grille
    private boolean isValidRow(int[][] grid, int row) {
        boolean[] seen = new boolean[9]; 
        for (int i = 0; i < 9; i++) {
            int num = grid[row][i]; // numéro à vérifier dans la ligne
            if (num < 1 || num > 9 || seen[num - 1]) {
                return false; // si le chiffre est hors de la plage ou déjà vu, retourne false
            }
            seen[num - 1] = true; // Marque le chiffre comme vu
        }
        return true; 
    }

    // valider une colonne de la grille
    private boolean isValidColumn(int[][] grid, int col) {
        boolean[] seen = new boolean[9]; // Tableau pour marquer les chiffres vus
        for (int i = 0; i < 9; i++) {
            int num = grid[i][col]; // Numéro à vérifier dans la colonne
            if (num < 1 || num > 9 || seen[num - 1]) {
                return false; // Si le chiffre est hors de la plage ou déjà vu, retourne false
            }
            seen[num - 1] = true; // Marque le chiffre comme vu
        }
        return true; // Si tous les chiffres sont valides dans la colonne, retourne true
    }
}
