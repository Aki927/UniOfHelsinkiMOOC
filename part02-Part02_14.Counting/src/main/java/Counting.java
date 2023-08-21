
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int userInput = Integer.valueOf(scanner.nextLine());
        
      /* for loop contains four parts: 
      (1)introducting variable 'i'; (2)condition; (3)inreasing the counter */
        for (int i = 0; i <= userInput; i++) {  //i++ same as i = i + 1
            System.out.println(i); //(4) functionality to be executed
        }


    }
}
