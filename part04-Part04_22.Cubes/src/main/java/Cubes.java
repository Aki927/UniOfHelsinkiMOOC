
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        
        while (true) {
            userInput = scanner.nextLine();
            if (userInput.equals("end")) {
                break;
            }
            int number = Integer.parseInt(userInput);
            int cubed = (int) Math.pow(number, 3);
            System.out.println(cubed);
        }
    }
}
