import java.io.FileWriter;
import java.io.IOException;

public class SudokuFileWriter {
    // Methode pour ecrire la grille transposee dans un fichier
    public void writeTransposedSudoku(String originalFileName, int[][] transposedGrid) {
        String transposedFileName = "transposition_" + originalFileName;

        try (FileWriter writer = new FileWriter(transposedFileName)) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    writer.write(transposedGrid[i][j] + " ");
                }
                writer.write("\n");
            }
            System.out.println("Grille transposée écrite dans le fichier : " + transposedFileName);
        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture du fichier : " + e.getMessage());
        }
    }
}
