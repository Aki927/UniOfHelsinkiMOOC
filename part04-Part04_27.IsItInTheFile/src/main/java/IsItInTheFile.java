
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");

        String file = scanner.nextLine();
        boolean found = false;
        String searchedFor;
        String row;

        try ( Scanner fileScan = new Scanner(Paths.get(file))) {

            System.out.println("Search for:");
            searchedFor = scanner.nextLine();

            while (fileScan.hasNextLine()) {
                row = fileScan.nextLine();
                if (row.contains(searchedFor)) {
                    found = true;
                    break; // Exit loop as soon as the text is found.
                }
            }
            if (found) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception ex) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}