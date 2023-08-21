
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int userInput = Integer.valueOf(scanner.nextLine());
 
    //for loop contains four parts: 
    //  (1)introducting variable 'i'; (2)condition; (3)inreasing the counter
        for (int i = userInput; i <= 100; i++) {
            System.out.println(i); //(4) functionality to be executed
        }

    }
}
