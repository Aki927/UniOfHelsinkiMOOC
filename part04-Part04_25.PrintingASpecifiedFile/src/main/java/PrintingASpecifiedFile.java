
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String userInput = scanner.nextLine();
        printFile(userInput);

    }
    public static String printFile(String userInput) {
        try (Scanner scan = new Scanner(Paths.get(userInput))) {
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                System.out.println(row);
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
        return userInput;
    }
}
