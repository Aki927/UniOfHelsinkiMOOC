
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int product = 1;
        
        System.out.println("Give a number:");
        int userInput = Integer.valueOf(scanner.nextLine());
        
        for (int i = 1; i <= userInput; i++) {
            product*=i;
        }
        
        System.out.println("Factorial: " + product);

    }
}
