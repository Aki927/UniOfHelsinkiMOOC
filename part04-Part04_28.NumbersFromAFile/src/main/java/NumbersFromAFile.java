
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Numbers: " + 
                countNumInRange(file, lowerBound, upperBound));

    }
    
    public static int countNumInRange(String file, int lowerBound, int upperBound) {
        String row;
        int numCounter = 0;
        
        try ( Scanner fileScan = new Scanner(Paths.get(file))) {                 
            while (fileScan.hasNextLine()) {
                row = fileScan.nextLine();
                int number = Integer.parseInt(row);
                if (number >= lowerBound && number <= upperBound) {
                    numCounter++;
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return numCounter;
    }
}
