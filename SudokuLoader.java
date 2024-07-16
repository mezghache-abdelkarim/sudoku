import java.io.*;

public class SudokuLoader {
    // charger un Sudoku depuis un fichier
    public int[][] loadSudoku(String filePath) throws IOException {
        int[][] grid = new int[9][9]; // Initialisation de la grille Sudoku
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] triplets = line.split(" ");
                for (String triplet : triplets) {
                    int x = Character.getNumericValue(triplet.charAt(0)); // numéro de ligne
                    int y = Character.getNumericValue(triplet.charAt(1)); // numéro de colonne
                    int z = Character.getNumericValue(triplet.charAt(2)); // valeur

                    // Check la les triplets 
                     if (x < 0 || x >= 9 || y < 0 || y >= 9 || z < 1 || z > 9) {
                        throw new IOException("Valeurs de triplet hors limites: " + triplet);
                    }
                    grid[x][y] = z; // Remplissage de la grille avec les valeurs du fichier
                }
            }
        } catch (IOException e) {
            throw new IOException("Erreur lors de la lecture du fichier", e);
        }
        
        return grid; 
    }
}
