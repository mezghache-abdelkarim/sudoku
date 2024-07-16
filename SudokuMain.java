
import java.io.IOException;

public class SudokuMain {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java SudokuMain <chemin-vers-fichier>");
            return;
        }

        // Récupère le chemin vers le fichier en argument
        String filePath = args[0]; 

        //Initialise le chargement le validateur et le transposeur , l'affichage et la sauvgarde du fichier transposer
        SudokuLoader loader = new SudokuLoader();
        SudokuValidator validator = new SudokuValidator();
        SudokuTransposer transposer = new SudokuTransposer();
        SudokuPrinter printer = new SudokuPrinter();
        SudokuFileWriter fileWriter = new SudokuFileWriter();

        try {
            int[][] grid = loader.loadSudoku(filePath); // Charge la grille Sudoku depuis le fichier
            if (validator.isValidSudoku(grid)) {
                System.out.println("Grille d'origine:");
                printer.printGrid(grid);
                
                int[][] transposedGrid = transposer.transpose(grid);

                System.out.println("Grille transposée :");
                printer.printGrid(transposedGrid);

                // Écrit la grille transposée dans un fichier
                fileWriter.writeTransposedSudoku(filePath, transposedGrid);
            } else {
                System.out.println("La grille n'est pas valide.");
            }
        } catch (IOException e) {
            System.out.println("Erreur : " + e.getMessage()); // Gestion des erreurs de chargement de fichier
        }
    }
}
