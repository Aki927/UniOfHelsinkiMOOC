
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                numberOfPositives = numberOfPositives + 1;
            }
            
            if (number < 0) {
                numberOfNegatives = numberOfNegatives + 1;
            }
            
            if (number > 0 || number != 0) {
                sum = sum + number;
            }
            
        }
        
        System.out.println("Number of numbers: " + (numberOfPositives + numberOfNegatives));
        
        System.out.println("Sum of the numbers: " + sum);

    }
}
