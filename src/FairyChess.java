import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The driver class for the Fairy Chess project.
 */
public class FairyChess {
    public static void main(String[] args) {

        // Get the board file's name, and initialize a File object to represent it
		if (args.length < 1) {
			throw new IllegalArgumentException("Provide a file name as first argument");
		}

        String boardFilename = args[0];
        File boardFile = new File(boardFilename);

        // Initialize the Scanner
        Scanner boardScanner = null;
        try {
            boardScanner = new Scanner(boardFile);
        } catch (FileNotFoundException e) {
			throw new IllegalArgumentException("Board file does not exist");
        }

        // Read the file line by line, printing out as we go along
        while (boardScanner.hasNextLine()) {
            String line = boardScanner.nextLine();

            System.out.println(line);
        }
    }
}
